package com.macro.mall.mapper;

import com.macro.mall.model.SmsHomeItem;
import com.macro.mall.model.SmsHomeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsHomeItemMapper {
    int countByExample(SmsHomeItemExample example);

    int deleteByExample(SmsHomeItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeItem record);

    int insertSelective(SmsHomeItem record);

    List<SmsHomeItem> selectByExample(SmsHomeItemExample example);

    SmsHomeItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsHomeItem record, @Param("example") SmsHomeItemExample example);

    int updateByExample(@Param("record") SmsHomeItem record, @Param("example") SmsHomeItemExample example);

    int updateByPrimaryKeySelective(SmsHomeItem record);

    int updateByPrimaryKey(SmsHomeItem record);
}