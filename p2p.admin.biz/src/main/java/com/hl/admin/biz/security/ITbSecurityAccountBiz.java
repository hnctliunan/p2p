package com.hl.admin.biz.security;

import com.hl.admin.base.vo.DataVO;
import com.hl.admin.entity.security.TbSecurityAccount;

public interface ITbSecurityAccountBiz {

    /**
     * 验证码用户名和密码
     * @param strUsername 用户名
     * @param strPassword 密码
     * @return DataVO
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    public DataVO<TbSecurityAccount> userLogin(String strUsername, String strPassword);
}
