package com.hl.admin.biz.security.impl;

import com.hl.admin.biz.security.ITbSecurityAccountRoleBiz;
import com.hl.admin.dao.security.TbSecurityAccountRoleResourcesExtMapper;
import com.hl.admin.entity.security.TbSecurityAccountRoleMapping;
import com.hl.admin.entity.security.TbSecurityResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2016/3/17.
 */
@Service
public class TbSecurityAccountRoleBizImpl implements ITbSecurityAccountRoleBiz {

    @Autowired
    private TbSecurityAccountRoleResourcesExtMapper intrScrtAconRoleRsorExtMapper;
    /**
     * 获取用户拥有的资源
     * @param accountId 账号id
     * @return
     * @author liunan
     */
    @Override
    public List<TbSecurityResource> selectAccRes(String accountId) {
        return intrScrtAconRoleRsorExtMapper.selectAccRes(accountId);
    }

    //	查询后台资源中的二级菜单
    @Override
    public List<TbSecurityResource> queryAccountAccessSecondResource( String accountId) {
        return this.intrScrtAconRoleRsorExtMapper.queryAccountAccessSecondResource(accountId);
    }
}
