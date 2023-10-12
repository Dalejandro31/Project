package com.ucundi.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ucundi.demo.repositories.monitoresRepositories;


@Controller 
public class monitores {


    @GetMapping("/monitores")
    public String helloWorld(Model model){
         model.addAttribute("title", "monitore: ");
        model.addAttribute("banner", "/images/banerMonitor.png");
        model.addAttribute("pathimage", "/images/monitores.jpg");
        model.addAttribute("pathimage2", "/images/monitores.jpg");
        model.addAttribute("pathimage3", "/images/monitores.jpg");
        return "index"; 
    }
}