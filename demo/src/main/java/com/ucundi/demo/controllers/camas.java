package com.ucundi.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class camas {

    @GetMapping("/camas")
    public String helloWorld(Model model){
        model.addAttribute("title", "Camas");
        return "index"; 
    }
}