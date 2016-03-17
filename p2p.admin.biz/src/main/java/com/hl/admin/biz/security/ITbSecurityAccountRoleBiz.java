package com.hl.admin.biz.security;

import com.hl.admin.entity.security.TbSecurityResource;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/3/17.
 */
public interface ITbSecurityAccountRoleBiz {

    /**
     * 获取用户拥有的资源
     * @param strAccountId 账户DataId
     * @return list
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    public  List<Map<String,Object>> selectAccRes(String strAccountId);

    /**
     * 查询后台资源中的二级菜单
     * @param strAccountDataId 账户DataId
     * @return list
     * @version 0.1.0 2016/03/15
     * @author liunan
     */
    public List<TbSecurityResource> queryAccountAccessSecondResource(String strAccountDataId);
}
