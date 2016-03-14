package os.web.util.shiro;

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
		if(null == authcToken){
			return null;
		}
		UsernamePasswordToken token = (UsernamePasswordToken)authcToken;
		String temp = "";
		for(char c : token.getPassword()){
			temp += c;
		}
//		ITbSecurityCustomerBiz tbSecurityCustomer = (ITbSecurityCustomerBiz)ContextUtil.getBean(ITbSecurityCustomerBiz.class);
//		DataVO<TbSecurityCustomer> customerVO = tbSecurityCustomer.queryLoginByNameAndPass(token.getUsername(),temp);
//		if(customerVO.isSuccess()){
//			Session session = SecurityUtils.getSubject().getSession();
//			session.setAttribute(SessionConstant.CURRENT_SESSION_USERINFO,customerVO.getResult());
//			session.setAttribute(SessionConstant.CURRENT_SESSION_ID,customerVO.getResult().getDataId());
			SimpleAuthenticationInfo simpleAuthenticationInfo = null;//new SimpleAuthenticationInfo(customerVO.getResult().getDataId(),temp,this.getName());
			return simpleAuthenticationInfo;
//		}else{
//			throw new IncorrectCredentialsException(customerVO.getMessage());//账号被锁定
//		}
	}
	
}