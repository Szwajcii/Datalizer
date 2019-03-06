package com.codecool.krk.datalizer.service;

import com.codecool.krk.datalizer.model.Column;
import com.codecool.krk.datalizer.model.ColumnList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

@Service
public class DataGenerator implements IDataGenerator {


//    private static Map<String, Supplier<String>> functionMap = new ColumnsMethods().getFunctions();

//    public static String getData(List<String> columns, int quantity) {
//
//        StringBuilder sb = new StringBuilder();
//
//
//        for(int i = 0; i < quantity; i++) {
//            int size = columns.size();
//            for(String column : columns) {
//
//                if(size == 1) {
//                    sb.append(getColumnValue(column));
//                } else {
//                    sb.append(getColumnValue(column) + ",");
//                }
//                size--;
//            }
//            sb.append("\n");
//        }
//
//        return sb.toString();
//    }

//    private static String getColumnValue(String column) {
//
//        try {
//            return functionMap.get(column).get();
//        } catch (Exception e) {
//            return null;
//        }
//
//    }


    @Override
    public List<String> getColumns(ColumnList columnList) {

        List<String> columnsNames = new ArrayList<>();

        List<Column> columns = columnList.getColumnList();

        for(int i = 0; i < columns.size(); i++) {
            columnsNames.add(columns.get(i).getName());
        }
        return columnsNames;
    }


}
