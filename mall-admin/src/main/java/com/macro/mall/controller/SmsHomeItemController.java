package com.macro.mall.controller;

import com.github.pagehelper.Page;
import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.SmsHomeItem;
import com.macro.mall.service.SmsHomeItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "SmsHomeItemController", description = "首页商品管理")
@RequestMapping("/home/item")
public class SmsHomeItemController {
    @Autowired
    private SmsHomeItemService itemService;

    @ApiOperation("分页查询推荐品牌")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsHomeItem>> list(@RequestParam(value = "title", required = false) String title,
                                                      @RequestParam(value = "recommendStatus", required = false) Integer recommendStatus,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsHomeItem> itemList = itemService.list(title, recommendStatus, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(itemList));
    }
}
