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
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "home/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object login(String username,String password,String remember){
		Map<String,Object> result = new HashMap<>();
		if(StringUtils.isEmpty(username)){
			result.put("success",false);
			result.put("message","请输入登录帐号!");
			return result;
		}
		if(StringUtils.isEmpty(password)){
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
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
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

	@RequestMapping(value="/main.html",method=RequestMethod.GET)
	public String main(){
		return "home/main";
	}

	@RequestMapping(value="/top.html",method=RequestMethod.GET)
	public String top(Model model){
		Subject subject = SecurityUtils.getSubject();
		String username = subject.getPrincipal().toString();
		List<TbSecurityResource> resources = this.intrSecurityAccountRoleBiz.queryAccountAccessSecondResource(username);
		model.addAttribute("menus",resources);
		return "home/top";
	}

	@RequestMapping(value="/left.html",method=RequestMethod.GET)
	public String left(HttpServletRequest request,Model model,String parent){
		String root = request.getSession().getServletContext().getContextPath();
		Subject subject = SecurityUtils.getSubject();
		List<?> res = this.intrSecurityAccountRoleBiz.selectAccRes(subject.getPrincipal().toString());
		if(null != res && !res.isEmpty()){
			StringBuffer sb = new StringBuffer();
			Map<?,?> mResource = null;
			for(int i=0,len = res.size();i<len;i++){
				mResource = (Map<?,?>) res.get(i);
				if(mResource.get("data_id").equals(parent)){
					model.addAttribute("resName",mResource.get("res_name"));
					break;
				}
			}
			if(null != mResource){
				Map<?,?> tempRes = null;
				for(int i=0,len = res.size();i<len;i++){
					tempRes =  (Map<?,?>) res.get(i);
					if(tempRes.get("res_parent").equals(mResource.get("data_id"))){
						sb.append("<dd>");
						sb.append("<div class=\"title\">");
						sb.append("<span><img src=\""+root+"/resources/images/leftico01.png\" /></span>"+tempRes.get("res_name"));
						sb.append("</div>");
						sb.append("<ul class=\"menuson\">");
						Map<?,?> t = null;
						for(int j=0,l=res.size();j<l;j++){
							t = (Map<?,?>) res.get(j);
							if(t.get("res_parent").equals(tempRes.get("data_id"))){
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


	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(){
		return "home/index";
	}

}