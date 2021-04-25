package com.mychen.mall.api.controller.vo;

import com.mychen.mall.api.entity.MallGoodsCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author user
 * @date 2021/4/21
 * @description SecondLevelCategoryVO 二级分类VO
 */
@Data
public class SecondLevelCategoryVO implements Serializable {
    @ApiModelProperty("当前二级分类id")
    private Long categoryId;
    @ApiModelProperty("父级分类id")
    private Long parentId;
    @ApiModelProperty("当前分类级别")
    private Byte categoryLevel;
    @ApiModelProperty("当前二级分类名称")
    private String categoryName;
    @ApiModelProperty("三级分类列表")
    private List<ThirdLevelCategoryVO> thirdLevelCategoryVos;
}