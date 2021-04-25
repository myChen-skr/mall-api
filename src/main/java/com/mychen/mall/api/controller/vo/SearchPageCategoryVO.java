package com.mychen.mall.api.controller.vo;

import com.mychen.mall.api.entity.MallGoodsCategory;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author user
 * @date 2021/4/21
 * @description SearchPageCategoryVO 搜索页面分类VO
 */
@Data
public class SearchPageCategoryVO implements Serializable {
    private String firstLevelCategoryName;
    private List<MallGoodsCategory> secondLevelCategoryList;
    private String secondLevelCategoryName;
    private List<MallGoodsCategory> thirdLevelCategoryList;
    private String currentCategoryName;
}