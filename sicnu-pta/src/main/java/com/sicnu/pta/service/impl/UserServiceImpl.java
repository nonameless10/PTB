package com.sicnu.pta.service.impl;

import com.sicnu.pta.dao.UserDao;
import com.sicnu.pta.entity.po.User;
import com.sicnu.pta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    /*
     *
     * @Author nonameless
     * @Description //TODO 判断用户登录信息是否正确
     * @Date 12:18 2020/10/8
     * @Param [email, password]
     * @return com.sicnu.pta.entity.po.User
     **/
    @Override
    public User judgeUserLogin(String email, String password) {
        return userDao.judgeUserLogin(email, password);
    }
}
