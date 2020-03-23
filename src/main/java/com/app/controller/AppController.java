package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("app")
public class AppController {

    @RequestMapping("/show")
    public ModelAndView modelAndView(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
