package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityResourceAccountMapping;
import com.hl.admin.entity.security.TbSecurityResourceAccountMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityResourceAccountMappingMapper {
    int countByExample(TbSecurityResourceAccountMappingExample example);

    int deleteByExample(TbSecurityResourceAccountMappingExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityResourceAccountMapping record);

    int insertSelective(TbSecurityResourceAccountMapping record);

    List<TbSecurityResourceAccountMapping> selectByExample(TbSecurityResourceAccountMappingExample example);

    TbSecurityResourceAccountMapping selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityResourceAccountMapping record, @Param("example") TbSecurityResourceAccountMappingExample example);

    int updateByExample(@Param("record") TbSecurityResourceAccountMapping record, @Param("example") TbSecurityResourceAccountMappingExample example);

    int updateByPrimaryKeySelective(TbSecurityResourceAccountMapping record);

    int updateByPrimaryKey(TbSecurityResourceAccountMapping record);

    void batchInsert(@Param("records") List<TbSecurityResourceAccountMapping> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityResourceAccountMapping> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}