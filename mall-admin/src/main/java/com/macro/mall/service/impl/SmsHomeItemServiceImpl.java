package com.macro.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.macro.mall.mapper.SmsHomeItemMapper;
import com.macro.mall.model.SmsHomeItem;
import com.macro.mall.model.SmsHomeItemExample;
import com.macro.mall.service.SmsHomeItemService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SmsHomeItemServiceImpl implements SmsHomeItemService {
    @Autowired
    private SmsHomeItemMapper itemMapper;
    @Override
    public int create(List<SmsHomeItem> homeItemList) {
        return 0;
    }

    @Override
    public int updateSort(Long id, Integer sort) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        return 0;
    }

    @Override
    public List<SmsHomeItem> list(String title, Integer recommendStatus, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        SmsHomeItemExample example = new SmsHomeItemExample();
        SmsHomeItemExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(title)) {
            criteria.andTitleLike("%"+title+"%");

        }
        if(recommendStatus!=null){
            criteria.andBarcodeIsNull();
        }
        //example.setOrderByClause("sort desc");
        return itemMapper.selectByExample(example);
    }
}
