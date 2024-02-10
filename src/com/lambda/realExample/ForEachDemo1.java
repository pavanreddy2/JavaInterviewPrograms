package com.lambda.realExample;

import java.util.HashMap;
import java.util.Map;

public class ForEachDemo1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"pavan");
        map.put(2,"anurudh");
        map.put(3,"sunitha");
        map.put(4,"chakri");
        map.put(5,"madhu");

        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        System.out.println();
        map.forEach((key,value) -> System.out.println(key+ " =="+value));
        //Here we can use map.forEach () , we can't use the Pipeline method present in the stream class.
        // for we can do
        System.out.println();
        map.entrySet().stream().forEach(s-> System.out.println(s));
    }
}
