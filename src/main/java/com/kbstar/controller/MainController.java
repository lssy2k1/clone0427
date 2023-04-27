package com.kbstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/aboutUs")
    public String aboutUs(Model model){
        model.addAttribute("center", "aboutUs");
        return "index";
    }
    @RequestMapping("/ourService")
    public String ourService(Model model){
        model.addAttribute("center", "ourService");
        return "index";
    }
    @RequestMapping("/portfolio")
    public String portfolio(Model model){
        model.addAttribute("center", "portfolio");
        return "index";
    }
    @RequestMapping("/surplus")
    public String surplus(Model model){
        model.addAttribute("center", "surplus");
        return "index";
    }
    @RequestMapping("/testimonial")
    public String testimonial(Model model){
        model.addAttribute("center", "testimonial");
        return "index";
    }
}
