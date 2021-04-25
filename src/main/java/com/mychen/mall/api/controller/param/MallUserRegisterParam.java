package com.mychen.mall.api.controller.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author user
 * @date 2021/4/21
 * @description MallUserRegisterParam 用户注册param
 */
@Data
public class MallUserRegisterParam implements Serializable {
    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;
    @ApiModelProperty("用户密码")
    @NotEmpty(message = "密码不能为空")
    private String password;


}
