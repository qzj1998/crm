package com.lm.crm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author: Liumin
 * @Date: 2019/11/6 16:18
 */

@Controller
public class IndexController {

    @RequestMapping("/loginUI")
    public String loginUI() {
        return "redirect:login.html";
    }

}
