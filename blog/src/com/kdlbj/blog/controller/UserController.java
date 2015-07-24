package com.kdlbj.blog.controller;

import com.kdlbj.blog.model.User;
import com.kdlbj.blog.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by kdlbj__ on 15/7/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "user/index";
    }

    @ResponseBody
    @RequestMapping("/register")
    public User register() {
        logger.info("user/register");
        User user = new User();
        user.setEmail("930239530@qq.com");
        user.setAddress("古荡新村东10幢");
        user.setPassword("123456");
        user.setNick("kdlbj__");
        user.setSex("m");
        user.setSignature("眼睛疼");
        userService.save(user);
        return user;

    }

}
