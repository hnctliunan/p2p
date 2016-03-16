package com.hl.admin.biz.security;
import com.hl.admin.base.biz.IBaseBiz;
import com.hl.admin.base.vo.DataVO;
import com.hl.admin.entity.security.TbSecurityAccount;

public interface ITbSecurityAccountBiz extends IBaseBiz {
	
	public DataVO<TbSecurityAccount> userLogin(String username, String password);
}