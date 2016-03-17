package com.hl.admin.biz.security.impl;

import com.hl.admin.biz.security.ITbSecurityAccountRoleBiz;
import com.hl.admin.dao.security.TbSecurityAccountRoleResourcesExtMapper;
import com.hl.admin.entity.security.TbSecurityResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TbSecurityAccountRoleBizImpl implements ITbSecurityAccountRoleBiz {

    @Autowired
    private TbSecurityAccountRoleResourcesExtMapper intrScrtAconRoleRsorExtMapper;
    /**
     * 获取用户拥有的资源
     * @param strAccountDataId 账户DataId
     * @return list
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    @Override
    public List<Map<String,Object>> selectAccRes(String strAccountDataId) {
        return intrScrtAconRoleRsorExtMapper.selectAccRes(strAccountDataId);
    }

    /**
     * 查询后台资源中的二级菜单
     * @param strAccountDataId 账户DataId
     * @return list
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    @Override
    public List<TbSecurityResource> queryAccountAccessSecondResource( String strAccountDataId) {
        return this.intrScrtAconRoleRsorExtMapper.queryAccountAccessSecondResource(strAccountDataId);
    }
}
