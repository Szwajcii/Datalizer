package com.codecool.krk.datalizer.service;

import com.codecool.krk.datalizer.model.ColumnList;

import java.io.IOException;
import java.util.List;

public interface IDataGenerator {
    List<String> getColumns(ColumnList columnList) throws IOException;
}
