package com.hl.admin.controller.home;

import com.hl.admin.util.controller.BaseController;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class HomeLoginController extends BaseController {
	
	private static final long serialVersionUID = 1L;
//
//	@Autowired
//	private ITbSecurityAccountBiz iTbSecurityAccountBiz;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "home/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object login(Model model,String username,String password,String remember){
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
//		ITbSecurityAccountBiz iTbSecurityAccountBiz = (ITbSecurityAccountBiz) ContextUtil.getBean(ITbSecurityAccountBiz.class);
//		DataVO<TbSecurityAccount> vo  =  iTbSecurityAccountBiz.userLogin("admin","123456");
		try{
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
			token.setRememberMe(StringUtils.isNotEmpty(remember) && remember.equals("true") ? true : false );
			subject.login(token);
			result.put("success",true);
			result.put("message","您已成功登录本系统!");
		}catch(Exception e){
			result.put("success",false);
			result.put("message","登录失败!");
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
	
}