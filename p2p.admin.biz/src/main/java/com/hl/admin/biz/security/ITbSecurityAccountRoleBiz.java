package com.hl.admin.biz.security;

import com.hl.admin.entity.security.TbSecurityResource;

import java.util.List;

/**
 * Created by admin on 2016/3/17.
 */
public interface ITbSecurityAccountRoleBiz {
    /**
     * 获取用户拥有的资源
     * @param accountId 账号id
     * @return
     * @author liunan
     */
    public List<TbSecurityResource> selectAccRes(String accountId);

    public List<TbSecurityResource> queryAccountAccessSecondResource(String accountId);
}
