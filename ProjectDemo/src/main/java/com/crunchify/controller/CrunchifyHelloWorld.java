package com.crunchify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrunchifyHelloWorld {

    @RequestMapping("/welcome")
    public String helloWorld() {

        String message = "demo";
        return message;
    }

    @RequestMapping("/book")
    public String showBook(){
        String msg = "book";
        return msg;
    }
}