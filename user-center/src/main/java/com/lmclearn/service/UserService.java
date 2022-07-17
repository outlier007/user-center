package com.lmclearn.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lmclearn.model.domain.User;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务接口
 *
 * @author lmc
 */
public interface UserService extends IService<User> {



    /**
     * 用户注册
     *
     * @param userAccount   账户
     * @param userPassword  密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     * 用户登录
     *
     * @param userAccount  账户
     * @param userPassword 密码
     * @return 用户脱敏后的信息
     */
    User userLogin(String userAccount, String userPassword,HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @return
     */
    public int userLogout(HttpServletRequest request);
}
