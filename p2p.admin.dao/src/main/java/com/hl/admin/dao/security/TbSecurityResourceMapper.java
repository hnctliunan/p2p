package com.hl.admin.dao.security;

import com.hl.admin.entity.security.TbSecurityResource;
import com.hl.admin.entity.security.TbSecurityResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSecurityResourceMapper {
    int countByExample(TbSecurityResourceExample example);

    int deleteByExample(TbSecurityResourceExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityResource record);

    int insertSelective(TbSecurityResource record);

    List<TbSecurityResource> selectByExample(TbSecurityResourceExample example);

    TbSecurityResource selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityResource record, @Param("example") TbSecurityResourceExample example);

    int updateByExample(@Param("record") TbSecurityResource record, @Param("example") TbSecurityResourceExample example);

    int updateByPrimaryKeySelective(TbSecurityResource record);

    int updateByPrimaryKey(TbSecurityResource record);

    void batchInsert(@Param("records") List<TbSecurityResource> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityResource> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}