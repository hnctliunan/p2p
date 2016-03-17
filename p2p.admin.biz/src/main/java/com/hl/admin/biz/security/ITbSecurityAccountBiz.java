package com.hl.admin.biz.security;

import com.hl.admin.base.vo.DataVO;
import com.hl.admin.entity.security.TbSecurityAccount;

public interface ITbSecurityAccountBiz {
    public DataVO<TbSecurityAccount> userLogin(String username, String password);
}
