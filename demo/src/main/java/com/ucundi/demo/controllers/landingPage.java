package com.ucundi.demo.controllers;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class landingPage {
    @GetMapping("/")
    public String helloWorld(Model model){
        model.addAttribute("title", "SetupsGaming");
        model.addAttribute("banner", "/images/Bannerindex.jpg");
        model.addAttribute("pathimage", "/images/setup.jpg");
        model.addAttribute("pathimage2", "/images/setup.jpg");
        model.addAttribute("pathimage3", "/images/setup.jpg");
        return "index"; 
    }
}
