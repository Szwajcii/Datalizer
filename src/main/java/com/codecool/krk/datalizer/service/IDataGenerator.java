package com.codecool.krk.datalizer.service;

import com.codecool.krk.datalizer.model.ColumnList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IDataGenerator {
    List<String> getColumns(ColumnList columnList) throws IOException;
    String getData(List<String> columns, int quantity) throws IOException;
    void generateCSV(String csvName, List<String> columns, int recordNumber) throws FileNotFoundException;
}
