package com.hl.admin.util.shiro;

import com.hl.admin.biz.security.ITbSecurityAccountBiz;
import com.hl.admin.base.vo.DataVO;
import com.hl.admin.entity.security.TbSecurityAccount;
import com.hl.utils.applicationcontext.ContextUtil;
import com.hl.utils.constant.SessionConstant;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;


public class DataBaseRealm extends AuthorizingRealm{
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		if(null == principals){
			return null;
		}
		SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
		String currentUsername = (String)super.getAvailablePrincipal(principals);
//		ITbSecurityAccessBiz tbSecurityAccessBiz = (ITbSecurityAccessBiz)ContextUtil.getBean(ITbSecurityAccessBiz.class);
//		DataVO<List<TbSecurityResource>> vo = tbSecurityAccessBiz.getMyAccess(currentUsername);
//		if(vo.isSuccess()){
//			for(TbSecurityResource r : vo.getResult()){
//				simpleAuthorInfo.addStringPermission(r.getResourceCode());
//			}
//		}
		simpleAuthorInfo.addStringPermission("TbSecurityResource:main");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:add");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:delete");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:bdelete");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:detail");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:modify");
		simpleAuthorInfo.addStringPermission("TbSecurityResource:save");
		return simpleAuthorInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		if (authcToken == null) return null;
		try{
			ITbSecurityAccountBiz tbSecurityAccountBiz = (ITbSecurityAccountBiz) ContextUtil.getBean(ITbSecurityAccountBiz.class);
			UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
			String temp = "";
			for(char c : token.getPassword()){
				temp += c;
			}
			DataVO<TbSecurityAccount> resultVO = tbSecurityAccountBiz.userLogin(token.getUsername(),temp);
			if(resultVO.isSuccess()){
				TbSecurityAccount objAccount = resultVO.getResult();
				Session session = SecurityUtils.getSubject().getSession();
				session.setAttribute(SessionConstant.LOGIN_ID,objAccount.getDataId());
				session.setAttribute(SessionConstant.LOGIN_NAME,objAccount.getLoginName());
				SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(objAccount.getDataId(),temp,this.getName());
				return simpleAuthenticationInfo;
			}else{
				throw new AuthenticationException(resultVO.getMessage());
			}
		}catch(Exception e){
			throw new AuthenticationException(e.getMessage());
		}
	}
}