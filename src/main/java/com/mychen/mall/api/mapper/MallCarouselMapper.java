package com.mychen.mall.api.mapper;

import com.mychen.mall.api.entity.MallCarousel;

/**
 * @Entity com.mychen.mall.api.entity.MallCarousel
 */
public interface MallCarouselMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallCarousel record);

    int insertSelective(MallCarousel record);

    MallCarousel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallCarousel record);

    int updateByPrimaryKey(MallCarousel record);

}




