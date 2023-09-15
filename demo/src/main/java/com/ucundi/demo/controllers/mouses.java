package com.ucundi.demo.controllers;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class mouses {

    @GetMapping("/mouses")
    public String helloWorld(Model model){
        model.addAttribute("title", "Mouse");
        model.addAttribute("banner", "/images/banerMouse.png");
        model.addAttribute("pathimage", "/images/mouse.jpg");
        model.addAttribute("pathimage2", "/images/mouse.jpg");
        model.addAttribute("pathimage3", "/images/mouse.jpg");
        return "index"; 
    }
}
