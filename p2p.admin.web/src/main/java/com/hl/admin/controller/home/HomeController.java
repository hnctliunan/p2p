package com.hl.admin.controller.home;

import com.hl.admin.biz.security.ITbSecurityAccountRoleBiz;
import com.hl.admin.entity.security.TbSecurityResource;
import com.hl.admin.util.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeController extends BaseController {
	private static final long serialVersionUID = 1L;

	@Autowired
	private ITbSecurityAccountRoleBiz intrSecurityAccountRoleBiz;
	
	@RequestMapping(value="/anon/login.html",method=RequestMethod.GET)
	public String login(){
		return "home/login";
	}

	/**
	 * 用户登录
	 * @param username 用户名
	 * @param password 密码
	 * @param remember 是否记住密码
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/anon/login.json",method=RequestMethod.POST)
	@ResponseBody
	public Object login(String username,String password,String remember){
		Map<String,Object> result = new HashMap<>();
		if(StringUtils.isBlank(username)){
			result.put("success",false);
			result.put("message","请输入登录帐号!");
			return result;
		}
		if(StringUtils.isBlank(password)){
			result.put("success",false);
			result.put("message","请输入登录密码!");
			return result;
		}
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username,password);
		token.setRememberMe(StringUtils.isNotEmpty(remember) && remember.equals("true") ? true : false );
		try{
			subject.login(token);
			result.put("success",true);
			result.put("message","您已成功登录本系统!");
		}catch(Exception e){
			result.put("success",false);
			result.put("message",e.getMessage());
		}
		return result;
	}

	/**
	 * 用户退出
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/authc/logout",method=RequestMethod.GET)
	public void logout(HttpServletRequest request,HttpServletResponse response){
		Subject subject = SecurityUtils.getSubject();
		if (subject != null) {
			subject.logout();
			try {
				response.sendRedirect(request.getSession().getServletContext().getContextPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 跳转到后台主页面
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/authc/main.html",method=RequestMethod.GET)
	public String main(){
		return "home/main";
	}

	/**
	 * 获取二级菜单
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/authc/top.html",method=RequestMethod.GET)
	public String top(Model model){
		Subject subject = SecurityUtils.getSubject();
		String strUsername = subject.getPrincipal().toString();
		List<TbSecurityResource> alResources = this.intrSecurityAccountRoleBiz.queryAccountAccessSecondResource(strUsername);
		model.addAttribute("menus",alResources);
		return "home/top";
	}

	/**
	 * 获取三级菜单
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/authc/left.html",method=RequestMethod.GET)
	public String left(HttpServletRequest request,Model model,String parent){
		String root = request.getSession().getServletContext().getContextPath();
		Subject subject = SecurityUtils.getSubject();
		List<Map<String,Object>> alResource = this.intrSecurityAccountRoleBiz.selectAccRes(subject.getPrincipal().toString());
		if(null != alResource && !alResource.isEmpty()){
			StringBuffer sb = new StringBuffer();
			Map<String,Object> strObjResource = null;
			for(int i=0,len = alResource.size();i<len;i++){
				strObjResource = alResource.get(i);
				if(strObjResource.get("data_id").equals(parent)){
					model.addAttribute("resName",strObjResource.get("res_name"));
					break;
				}
			}
			if(null != strObjResource){
				Map<String,Object> strObjTempRes = null;
				for(int i=0,len = alResource.size();i<len;i++){
					strObjTempRes =  alResource.get(i);
					if(strObjTempRes.get("res_parent").equals(strObjResource.get("data_id"))){
						sb.append("<dd>");
						sb.append("<div class=\"title\">");
						sb.append("<span><img src=\""+root+"/resources/images/leftico01.png\" /></span>"+strObjTempRes.get("res_name"));
						sb.append("</div>");
						sb.append("<ul class=\"menuson\">");
						Map<?,?> t = null;
						for(int j=0,l=alResource.size();j<l;j++){
							t = (Map<?,?>) alResource.get(j);
							if(t.get("res_parent").equals(strObjTempRes.get("data_id"))){
								sb.append("<li><cite></cite><a href=\""+root+t.get("res_url")+"\" target=\"rightFrame\">"+t.get("res_name")+"</a><i></i></li>");
							}
						}
						sb.append("</ul>");
					}
				}
			}
			model.addAttribute("menus",sb.toString());
		}
		return "home/left";
	}

	/**
	 * 页面跳转
	 * @return Object
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	@RequestMapping(value="/authc/index",method=RequestMethod.GET)
	public String index(){
		return "home/index";
	}

}