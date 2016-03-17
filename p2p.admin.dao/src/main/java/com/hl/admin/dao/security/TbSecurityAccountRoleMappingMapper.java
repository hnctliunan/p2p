package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityAccountRoleMapping;
import com.hl.admin.entity.security.TbSecurityAccountRoleMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityAccountRoleMappingMapper {
    int countByExample(TbSecurityAccountRoleMappingExample example);

    int deleteByExample(TbSecurityAccountRoleMappingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityAccountRoleMapping record);

    int insertSelective(TbSecurityAccountRoleMapping record);

    List<TbSecurityAccountRoleMapping> selectByExample(TbSecurityAccountRoleMappingExample example);

    TbSecurityAccountRoleMapping selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityAccountRoleMapping record, @Param("example") TbSecurityAccountRoleMappingExample example);

    int updateByExample(@Param("record") TbSecurityAccountRoleMapping record, @Param("example") TbSecurityAccountRoleMappingExample example);

    int updateByPrimaryKeySelective(TbSecurityAccountRoleMapping record);

    int updateByPrimaryKey(TbSecurityAccountRoleMapping record);

    void batchInsert(@Param("records") List<TbSecurityAccountRoleMapping> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityAccountRoleMapping> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}