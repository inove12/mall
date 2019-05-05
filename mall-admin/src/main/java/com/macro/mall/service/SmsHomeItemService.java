package com.macro.mall.service;

import com.macro.mall.model.SmsHomeItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SmsHomeItemService {
    /**
     * 添加首页品牌推荐
     */
    @Transactional
    int create(List<SmsHomeItem> homeItemList);

    /**
     * 修改品牌推荐排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量删除品牌推荐
     */
    int delete(List<Long> ids);

    /**
     * 更新推荐状态
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分页查询品牌推荐
     */
    List<SmsHomeItem> list(String title, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
