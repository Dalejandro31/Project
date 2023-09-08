package com.ucundi.demo.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class teclados {

    @GetMapping("/teclados")
    public String helloWorld(Model model){
        model.addAttribute("title", "Teclado");
        model.addAttribute("banner", "/images/banerTeclado.jpg");
        model.addAttribute("pathimage", "/images/teclados.jpg");
        model.addAttribute("pathimage2", "/images/teclados.jpg");
        model.addAttribute("pathimage3", "/images/teclados.jpg");
        return "index"; 
    }
}