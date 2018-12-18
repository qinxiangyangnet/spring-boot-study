package com.Stylesmile.entity;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author chenye
 * @date 2018/12/10
 */
@Data
public class SysUser {

    private String id;
    @NotEmpty(message = "登录名不能为空")
    private String loginName;
    @NotEmpty(message = "用户名称不能为空")
    private String name;
    @NotEmpty(message = "密码不能为空")
    //@Length(min = 6, message = "密码长度不能小于6位")
    private String password;
    private String nickName;
    private String phone;
    private String email;
    public SysUser(){}
    public SysUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
