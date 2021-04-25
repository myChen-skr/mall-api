package com.mychen.mall.api.service;

import com.mychen.mall.api.controller.vo.MallIndexGoodsVO;

import java.util.List;

/**
 * @author user
 * @date 2021/4/25
 * @description MallIndexConfigService
 */
public interface MallIndexConfigService {
    /**
     * 返回固定数量的首页配置商品对象(首页调用)
     *
     * @param configType 配置类型
     * @param number     商品数量
     * @return 首页信息
     */
    List<MallIndexGoodsVO> getConfigGoodsForIndex(int configType, int number);
}

