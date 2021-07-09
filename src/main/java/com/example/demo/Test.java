package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ning Baoqi
 * @date 2020/1/2 11:00
 */
public class Test {
    public static void main(String[] args) {
        /*String a="1|2|3|4|5||2|";
        String[] array=a.split("\\|",-1);
        System.out.println(array.length);*/
        List<String> a=new ArrayList<>();
        a.add("宁宝琪");
        a.add("最帅");
        String bb="076";
        Map<String,String> map=new HashMap<>();
        map.put("1","b");
        map.put("2","c");
        System.out.println(map.values());
        System.out.println(String.valueOf(Integer.valueOf(bb)));
           // System.out.println(a.contains("宁宝琪"));
    }
}
