package com.codecool.krk.datalizer.controller;

import com.google.gson.Gson;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class WebController {

    @GetMapping("/index")
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
    public String handleGenerator() {
        return "generator";
    }


    @PostMapping("/data")
    public String handleGeneratedData(HttpEntity<String> request) throws IOException {

        Gson g = new Gson();
        String json = request.getBody();

        System.out.println(json);

        return "generator";
    }


}
