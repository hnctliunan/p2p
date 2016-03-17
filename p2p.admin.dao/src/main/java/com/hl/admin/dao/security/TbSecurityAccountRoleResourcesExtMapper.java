package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityResource;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSecurityAccountRoleResourcesExtMapper {
	/**
	 * 根据用户id查询用户没有授予的角色
	 * @param status
	 * @param accountId
	 * @return
	 */
	List<?> selectAbleRole(@Param("status") String status, @Param("accountId") String accountId);
	

	
	/**
	 * 根据用户id查询用户已经授予的角色
	 * @param status
	 * @param accountId
	 * @return
	 */
	List<?> selectOwnRole(@Param("status") String status, @Param("accountId") String accountId);
	
	/**
	 * 根据用户id查询用户没有授予的角色
	 * @param status
	 * @param accountId
	 * @return
	 */
	List<TbSecurityResource> selectAccountAuthentic(String accountId);
	
	/**
	 * 根据用户拥有的资源
	 * @param status
	 * @param accountId
	 * @return
	 */
	List<TbSecurityResource> selectAccRes(String accountId);
	
	public List<String> queryAccountAccessCode(String accountId);
	
	public List<TbSecurityResource> queryAccountAccessSecondResource(String accountId);
	
}