package aaa.springboot02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("zsy")
public class zsy {


    @RequestMapping("hi")
    @ResponseBody
    public String hii() {
        return  "hello";
    }
}
