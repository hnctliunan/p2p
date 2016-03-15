package com.hl.biz.security;
import com.hl.base.biz.IBaseBiz;
import com.hl.base.vo.DataVO;
import com.hl.entity.security.TbSecurityAccount;

public interface ITbSecurityAccountBiz extends IBaseBiz {
	
	public DataVO<TbSecurityAccount> userLogin(String username, String password);
}