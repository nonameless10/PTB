package com.sicnu.pta.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sicnu.pta.entity.po.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.sicnu.pta.service.impl.UserServiceImpl;
import com.sicnu.pta.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    
    /*
     *
     * @Author nonameless
     * @Description //TODO 验证用户登录
     * @Date 12:19 2020/10/8
     * @Param [user]
     * @return java.lang.String
     **/
    @PostMapping("/login")
    public String judgeLogin(@RequestBody User user) throws JsonProcessingException {
        System.out.println(user);
        String email = user.getEmail();
        String password = user.getPassword();
        User resUser = userService.judgeUserLogin(user.getEmail(), user.getPassword());
        if(resUser != null) {
            String token = TokenUtil.sign(new User(email, password));
            HashMap<String,Object> hs=new HashMap<>();
            hs.put("token",token);
            ObjectMapper objectMapper=new ObjectMapper();
            return objectMapper.writeValueAsString(hs);
        } else {
            System.out.println("error");
            return "error";
        }
    }

    @GetMapping("/test")
    public String test() {
        return "success";
    }


}
