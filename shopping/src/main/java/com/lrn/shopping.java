package com.lrn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shopping {

    @RequestMapping("/home/test/")
    public String home()
    {
        String name = "My Name is Tarun";
        return name;
    }
}
