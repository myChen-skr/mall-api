package com.mychen.mall.api.controller.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author user
 * @date 2021/4/21
 * @description MallShoppingCartItemVO 购物项VO
 */
@Data
public class MallShoppingCartItemVO implements Serializable {
    @ApiModelProperty("购物项id")
    private Long cartItemId;
    @ApiModelProperty("商品id")
    private Long goodsId;
    @ApiModelProperty("商品数量")
    private Integer goodsCount;
    @ApiModelProperty("商品名称")
    private String goodsName;
    @ApiModelProperty("商品图片")
    private String goodsCoverImg;
    @ApiModelProperty("商品价格")
    private Integer sellingPrice;
}
