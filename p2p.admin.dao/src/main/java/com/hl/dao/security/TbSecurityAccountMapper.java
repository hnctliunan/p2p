package com.hl.dao.security;

import com.hl.entity.security.TbSecurityAccount;
import com.hl.entity.security.TbSecurityAccountExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSecurityAccountMapper {
    int countByExample(TbSecurityAccountExample example);

    int deleteByExample(TbSecurityAccountExample example);

    int deleteByPrimaryKey(String dataId);

    int insert(TbSecurityAccount record);

    int insertSelective(TbSecurityAccount record);

    List<TbSecurityAccount> selectByExample(TbSecurityAccountExample example);

    TbSecurityAccount selectByPrimaryKey(String dataId);

    int updateByExampleSelective(@Param("record") TbSecurityAccount record, @Param("example") TbSecurityAccountExample example);

    int updateByExample(@Param("record") TbSecurityAccount record, @Param("example") TbSecurityAccountExample example);

    int updateByPrimaryKeySelective(TbSecurityAccount record);

    int updateByPrimaryKey(TbSecurityAccount record);

    void batchInsert(@Param("records") List<TbSecurityAccount> records);

    void batchUpdateByPrimaryKey(@Param("records") List<TbSecurityAccount> records);

    void batchDeleteByPrimaryKey(@Param("records") List<String> records);
}