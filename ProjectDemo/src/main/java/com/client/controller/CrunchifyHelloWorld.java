package com.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String showBook(Model model){
        String msg = "book";

        String myName = "vikas kumawat";
        model.addAttribute("myNameValue",myName);

        return msg;
    }
}