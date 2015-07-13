package com.kdlbj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kdlbj__ on 15/7/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index() {
        return "user/index";
    }
}
