package com.ucundi.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class monitores {

    @GetMapping("/monitores")
    public String helloWorld(Model model){
        model.addAttribute("title", "Monitores");
        model.addAttribute("pathimage", "/images/monitores.jpg");
        return "index"; 
    }
}