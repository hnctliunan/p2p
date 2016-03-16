package com.hl.admin.controller.home;

import com.hl.admin.base.vo.DataVO;
import com.hl.admin.biz.security.ITbSecurityAccountBiz;
import com.hl.admin.entity.security.TbSecurityAccount;
import com.hl.admin.util.controller.BaseController;
import org.apache.shiro.SecurityUtils;
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

@Controller
@RequestMapping("/home")
public class HomeLoginController extends BaseController {
	
	private static final long serialVersionUID = 1L;

	@Autowired
	private ITbSecurityAccountBiz iTbSecurityAccountBiz;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(){
		return "home/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public Object login(Model model,String username,String password,String remember){
		DataVO<TbSecurityAccount> vo = iTbSecurityAccountBiz.userLogin("admin", "123456");
//		Map<String,Object> result = new HashMap<>();
//		if(StringUtils.isEmpty(username)){
//			result.put("success",false);
//			result.put("message","请输入登录帐号!");
//			return result;
//		}
//		if(StringUtils.isEmpty(password)){
//			result.put("success",false);
//			result.put("message","请输入登录密码!");
//			return result;
//		}
//		try{
//			Subject subject = SecurityUtils.getSubject();
//			UsernamePasswordToken token = new UsernamePasswordToken(username,password);
//			token.setRememberMe(StringUtils.isNotEmpty(remember) && remember.equals("true") ? true : false );
//			subject.login(token);
//			result.put("success",true);
//			result.put("message","您已成功登录本系统!");
//		}catch(Exception e){
//			result.put("success",false);
//			result.put("message","登录失败!");
//		}
//		return result;
		return null;
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