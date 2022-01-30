package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("/hi")
    public String niceToMeetyou(Model model){
        model.addAttribute("username","inki");
        return "greetings";
    }

    @GetMapping("/bye")
    public String SeeYouAgain(Model model){
        model.addAttribute("username","inki");
        return "bye";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
