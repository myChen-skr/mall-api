package com.mychen.mall.api.mapper;

import com.mychen.mall.api.entity.MallAdminUser;

/**
 * @Entity com.mychen.mall.api.entity.MallAdminUser
 */
public interface MallAdminUserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallAdminUser record);

    int insertSelective(MallAdminUser record);

    MallAdminUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallAdminUser record);

    int updateByPrimaryKey(MallAdminUser record);

}




