package com.example.demo.com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


/**
 * Created by hasyapasaribu on 9/13/17.
 */

@Controller
public class PageController {
    @RequestMapping("/perkalian")
    public String perkalian (@RequestParam(value = "a", required = false) String a, @RequestParam(value = "b", required = false) String b, Model model){
        int var1 = 0;
        int var2 = 0;
        int result = 0;
        if(a != null){
            var1 = Integer.parseInt(a);
        }
        model.addAttribute("var1", var1);
        if(b != null){
            var2 = Integer.parseInt(b);
        }
        model.addAttribute("var2", var2);
        result = var1 * var2;
        model.addAttribute("result", result);
        return "perkalian";
    }
}