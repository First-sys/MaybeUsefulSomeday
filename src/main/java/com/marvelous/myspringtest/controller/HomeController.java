package com.marvelous.myspringtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author July
 * @Date 2020/7/22 17:40
 * @Version 1.0
 **/

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){return "home";}
}
