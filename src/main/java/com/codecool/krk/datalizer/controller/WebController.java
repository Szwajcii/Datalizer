package com.codecool.krk.datalizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/home")
    public String handleIndex() {
        return "index";
    }

    @GetMapping("/about")
    public String handleAbout() {
        return "about";
    }

    @GetMapping("/categories")
    public String handleCategories() {
        return "categories";
    }

    @GetMapping("/generator")
    public String hangleGenerator() {
        return "generator";
    }

}
