package com.client.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CreateClient {
    @RequestMapping("/insert-client")
    public String show(){
        String url = "insert-client";
        return url;
    }
}
