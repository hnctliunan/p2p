package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityResourceRoleMapping;
import com.hl.admin.entity.security.TbSecurityResourceRoleMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityResourceRoleMappingMapper {
    int countByExample(TbSecurityResourceRoleMappingExample example);

    int deleteByExample(TbSecurityResourceRoleMappingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityResourceRoleMapping record);

    int insertSelective(TbSecurityResourceRoleMapping record);

    List<TbSecurityResourceRoleMapping> selectByExample(TbSecurityResourceRoleMappingExample example);

    TbSecurityResourceRoleMapping selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityResourceRoleMapping record, @Param("example") TbSecurityResourceRoleMappingExample example);

    int updateByExample(@Param("record") TbSecurityResourceRoleMapping record, @Param("example") TbSecurityResourceRoleMappingExample example);

    int updateByPrimaryKeySelective(TbSecurityResourceRoleMapping record);

    int updateByPrimaryKey(TbSecurityResourceRoleMapping record);

    void batchInsert(@Param("records") List<TbSecurityResourceRoleMapping> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityResourceRoleMapping> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}