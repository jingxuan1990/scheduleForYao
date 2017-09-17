package com.jingxuan.is.yao.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 首页控制器.
 * Created by andy on 2017/9/17.
 */
@Controller
@Log4j
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
