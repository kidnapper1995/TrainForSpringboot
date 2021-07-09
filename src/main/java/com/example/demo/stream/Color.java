package com.example.demo.stream;

/**
 * @author Ning Baoqi
 * @date 2020/9/3 15:30
 */
public enum Color {
    Blue("1","Blue"),
    Yellow("2","yello");

    private String id;
    private String color;
    private Color(String id,String color){
        this.id=id;
        this.color=color;
    }
    public String getColor(String id){
        return this.color;
    }

}
