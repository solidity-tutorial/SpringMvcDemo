package com.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CrunchifyHelloWorld {

    @RequestMapping("/welcome")
    public String helloWorld() {

        String message = "demo";
        return message;
    }

    @RequestMapping("/client/createclient")
    public String createClient(Model model){
        String msg = "/client/createclient";

        String myName = "vikas kumawat";
        model.addAttribute("myNameValue",myName);

        return msg;
    }

    @RequestMapping("/insert-client")
    public void insertClient(HttpServletRequest request, Model model){

    }

}