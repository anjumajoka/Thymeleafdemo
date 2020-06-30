package com.luv2code.springboot.thymeleafdemo.com.luv2code.springboot.thymeleafdemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){

        theModel.addAttribute("theDate" , new java.util.Date());

        return "helloworld";
    }
}
