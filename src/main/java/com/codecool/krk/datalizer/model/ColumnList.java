package com.codecool.krk.datalizer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ColumnList {

    private ArrayList<Column> columnList;
    private String recordNumber;

    public ColumnList(ArrayList<Column> columnList, String recordNumber) {
        this.columnList = columnList;
        this.recordNumber = recordNumber;
    }

    public ArrayList<Column> getColumnList() {
        return columnList;
    }

    public void setColumnList(ArrayList<Column> columnList) {
        this.columnList = columnList;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber;
    }

    @Override
    public String toString() {
        return "ColumnList{" +
                "columnList=" + columnList +
                '}';
    }
}
