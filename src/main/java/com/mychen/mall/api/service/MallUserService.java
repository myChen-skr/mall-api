package com.mychen.mall.api.service;

import com.mychen.mall.api.controller.param.MallUserUpdateParam;

/**
 * @author user
 * @date 2021/4/21
 * @description MallUserService 用户Service接口
 */
public interface MallUserService {
    /**
     * 用户注册
     * *
     * * @param loginName 登录名
     * * @param password  密码
     * * @return String
     */
    String register(String loginName, String password);

    /**
     * 登录
     * *
     * * @param loginName   登录名
     * * @param passwordMd5 md5加密密码
     * * @return String
     */
    String login(String loginName, String passwordMd5);

    /**
     * 用户信息修改
     * *
     * * @param mallUser 修改用户的参数实体
     * * @param userId   用户id
     * * @return boolean
     */
    Boolean updateUserInfo(MallUserUpdateParam mallUser, Long userId);

    /**
     * 退出登录
     * *
     * * @param userId 用户id
     * * @return boolean
     */
    Boolean logout(Long userId);
}
