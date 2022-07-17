package com.lmclearn.service;

import com.lmclearn.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("lmc");
        user.setUserAccount("123");
        user.setAvatarUrl("15646464");
        user.setGender(0);
        user.setUserPassword("9999");
        user.setPhone("1111");
        user.setEmail("5555");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);

    }

    @Test
    void userRegister() {
        String userAccount="lmcohj";
        String userPassword="123456789";
        String checkPassword="123456789";
        String planetCode="9";
        //非空
        long result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
        //用户名
        userAccount="12";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
        //密码不能小于8位
        userAccount="12345";
        userPassword="123456";
        checkPassword="123456";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
        //账户不能有特殊自负
        userAccount="12$3";
        userPassword="123456789";
        checkPassword="123456789";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
        //账户不能重复
        userAccount="12345";
        result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);
        Assertions.assertEquals(-1,result);
    }
}