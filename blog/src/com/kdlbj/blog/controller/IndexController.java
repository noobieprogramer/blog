package com.kdlbj.blog.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kdlbj__ on 15/7/22.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/index")
    public String index() {
        logger.error("index/index");
        return "index/index";
    }
}

