package com.example.lista;

public class President {
    private String name;
    private int startDate;
    private int endDate;
    private String description;


    public President(String name, int startDate , int endDate, String description) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }
    public String getName(){
        return  name;
    }
    public String getDescription(){
        return description;
    }
    public int getStartDate(){
        return startDate;
    }
    public int getEndDate(){
        return endDate;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
