package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityResource;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbSecurityAccountRoleResourcesExtMapper {

	/**
	 * 根据用户id查询用户没有授予的角色
	 * @param status 状态
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	List<?> selectAbleRole(@Param("status") String status, @Param("accountId") String accountId);

	/**
	 * 根据用户id查询用户已经授予的角色
	 * @param status 状态
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	List<?> selectOwnRole(@Param("status") String status, @Param("accountId") String accountId);

	/**
	 * 根据用户id查询用户没有授予的角色
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	List<TbSecurityResource> selectAccountAuthentic(String accountId);

	/**
	 * 根据用户拥有的资源
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	List<Map<String,Object>> selectAccRes(String accountId);

	/**
	 * 获取资源编码和资源排序
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	public List<String> queryAccountAccessCode(String accountId);

	/**
	 * 查询后台资源中的二级菜单
	 * @param accountId 用户DataId
	 * @return DataVO
	 * @version 0.1.0 2016/03/15
	 * @author liunan
	 */
	public List<TbSecurityResource> queryAccountAccessSecondResource(String accountId);
	
}