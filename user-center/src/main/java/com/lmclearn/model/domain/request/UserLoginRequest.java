package com.lmclearn.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author lmc
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 4914842123576214974L;
    //账号
    private String userAccount;
    //密码
    private String userPassword;

}
