package com.codecool.krk.datalizer.controller;

import com.codecool.krk.datalizer.model.ColumnList;
import com.codecool.krk.datalizer.service.IDataGenerator;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class WebController {

//    private IDataGenerator dataGenerator;


//    @Autowired
//    public WebController(IDataGenerator dataGenerator) {
//        this.dataGenerator = dataGenerator;
//    }


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

        System.out.println("DATA");

        Gson g = new Gson();
        String json = request.getBody();

        ColumnList columnList = g.fromJson(json, ColumnList.class);

        System.out.println(json);

        return "generator";
    }


}
