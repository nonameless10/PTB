package com.sicnu.pta.service;

import com.sicnu.pta.entity.po.User;

public interface UserService {

    
    /*
     *
     * @Author nonameless
     * @Description //TODO 判断用户登录信息是否正确
     * @Date 12:18 2020/10/8
     * @Param [email, password]
     * @return com.sicnu.pta.entity.po.User
     **/
    public User judgeUserLogin(String email,  String password);
}
