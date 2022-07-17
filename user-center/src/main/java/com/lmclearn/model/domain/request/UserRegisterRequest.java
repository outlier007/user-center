package com.lmclearn.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author lmc
 */
@Data
public class UserRegisterRequest implements Serializable {

    //系列化id
    private static final long serialVersionUID = 4914842123576214974L;
    //账号
    private String userAccount;
    //密码
    private String userPassword;
    //验证密码
    private String checkPassword;
    //星球编号
    private String planetCode;
}
