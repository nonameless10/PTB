package com.sicnu.pta.dao;

import com.sicnu.pta.entity.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    /*
     *
     * @Author nonameless
     * @Description //TODO 判断用户登录信息是否正确
     * @Date 12:17 2020/10/8
     * @Param [email, password]
     * @return com.sicnu.pta.entity.po.User
     **/
    public User judgeUserLogin(@Param("email") String email, @Param("password") String password);

}
