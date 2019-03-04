package com.codecool.krk.datalizer.service;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class DataGenerator implements IDataGenerator {


    private static Map<String, Supplier<String>> functionMap = new ColumnsMethods().getFunctions();

    public static String getData(List<String> columns, int quantity) {

        StringBuilder sb = new StringBuilder();



        return sb.toString();
    }


}
