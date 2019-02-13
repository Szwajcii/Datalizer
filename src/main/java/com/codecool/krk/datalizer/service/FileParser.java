package com.codecool.krk.datalizer.service;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileParser {

    public List<String> parseFile(File file) throws IOException {

        List<String> lines = new ArrayList<>();

        String line = "";

        BufferedReader reader = new BufferedReader(new FileReader(file));

        while((line = reader.readLine()) != null) {

            lines.add(line);

        }
        reader.close();
        return lines;
    }


}
