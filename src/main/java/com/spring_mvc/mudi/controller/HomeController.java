package com.spring_mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
        //  Model no Spring substitui a interface HttpRequest para adicionar atributo
    public String hello(Model model){
        model.addAttribute("nome", "Roberto Shimizu");
        return "index";
        // Spring/thymeleaf já reconhece um html de nome "hello" que deve ser
        // colocado na pasta template
    }
}
