package com.sc.xuefu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class indexController {

    @RequestMapping("/toIndex")
    public String toIndex(){

        System.out.println("to-->index !");
        return "to-->index !";
    }
}
