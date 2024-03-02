package com.firstproject.myappvs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/test")
    public String handle(){
        return "<h1>This is test</h1><hr>";
    }
}
