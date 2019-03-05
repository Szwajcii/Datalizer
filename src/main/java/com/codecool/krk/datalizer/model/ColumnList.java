package com.codecool.krk.datalizer.model;

import java.util.ArrayList;

public class ColumnList {

    private ArrayList<Column> columnList;

    public ColumnList(ArrayList<Column> columnList) {
        this.columnList = columnList;
    }

    public ArrayList<Column> getColumnList() {
        return this.columnList;
    }

    public void setColumnList(ArrayList<Column> columnList) {
        this.columnList = columnList;
    }

    @Override
    public String toString() {
        return "ColumnList{" +
                "columnList=" + columnList +
                '}';
    }
}
