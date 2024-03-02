package com.firstproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String handle(){
        return "<h1>test</h1>";
    }
}
