package com.mychen.mall.api.mapper;

import com.mychen.mall.api.entity.MallOrder;

/**
 * @Entity com.mychen.mall.api.entity.MallOrder
 */
public interface MallOrderMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);

}




