package com.tailus.students;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/")
    public String sayHello() {
        return "hello";
    }
}
