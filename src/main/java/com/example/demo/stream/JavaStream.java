package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ning Baoqi
 * @date 2020/9/3 15:20
 */
/*
public class JavaStream {
    public static void main(String[] args) {
        //Color a=new Color("1","Blue");
        //List<Color> shapes=new ArrayList<>();
        List<Entity> entities=new ArrayList<>();
        Entity entity=new Entity();
        entity.setId("1");
        entity.setColor("blue");
        entities.add(entity);
        List<Entity> shapes =
                entities.stream()
                .filter(s -> s.getId().equals("1"))
                //.forEach(s -> s.setColor("yellow"))
                        .collect(Collectors.toList());
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        //Collectors.toMap();
        System.out.println(squaresList);
    }
}
*/
