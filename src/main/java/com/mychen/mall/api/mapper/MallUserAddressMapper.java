package com.mychen.mall.api.mapper;

import com.mychen.mall.api.entity.MallUserAddress;

/**
 * @Entity com.mychen.mall.api.entity.MallUserAddress
 */
public interface MallUserAddressMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserAddress record);

    int insertSelective(MallUserAddress record);

    MallUserAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserAddress record);

    int updateByPrimaryKey(MallUserAddress record);

}




