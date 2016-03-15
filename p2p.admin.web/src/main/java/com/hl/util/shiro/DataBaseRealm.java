package com.hl.util.shiro;

import com.hl.base.vo.DataVO;
import com.hl.biz.security.ITbSecurityAccountBiz;
import com.hl.entity.security.TbSecurityAccount;
import com.hl.utils.applicationcontext.ContextUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.List;


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
		return simpleAuthorInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		if (authcToken == null) return null;
//		try{
//			ITbSecurityAccountBiz tbSecurityAccountBiz = (ITbSecurityAccountBiz) ContextUtil.getBean(ITbSecurityAccountBiz.class);
//			UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
//			String temp = "";
//			for(char c : token.getPassword()){
//				temp += c;
//			}
//			DataVO<TbSecurityAccount> resultVO = tbSecurityAccountBiz.userLogin(token.getUsername(),temp);
//			if(resultVO.isSuccess()){
//				TbSecurityAccount account = resultVO.getAccount();
//				Session session = SecurityUtils.getSubject().getSession();
//				session.setAttribute(SessionConstant.LOGIN_ID,account.getDataId());
//				session.setAttribute(SessionConstant.LOGIN_NAME,account.getLoginName());
//				SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(account.getDataId(),temp,this.getName());
//				return simpleAuthenticationInfo;
//			}else{
//				throw new AuthenticationException(vo.getMessage());
//			}
//		}catch(Exception e){
//			this.logger.error(e.getMessage());
//			throw new AuthenticationException(e.getMessage());
//		}
		return null;
	}
}