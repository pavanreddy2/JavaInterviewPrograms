package com.lambda.realExample;

import java.util.*;

public class MapSortDemo {
    public static void main(String[] args) {

        Map<Employee,Integer> map = new HashMap<>();

        map.put(new Employee(102,"pavan",90000d),12);
        map.put(new Employee(104, "anurudh",85000d),90);
        map.put(new Employee(105,"sunitha",78000d),89);
        map.put(new Employee(108,"sena",75050d),13);
        map.put(new Employee(103,"madhu",86000d),123);

 /*       //Traditional Way
        List<Map.Entry<Employee,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Employee, Integer>>() {

            @Override
            public int compare(Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2) {
                return (int) (o1.getKey().geteSalary() - o2.getKey().geteSalary());
            }
        });*/
        //Using Lambda Expression
        List<Map.Entry<Employee,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1,o2) -> (int) (o1.getKey().geteSalary()-o2.getKey().geteSalary()));

        for (Map.Entry<Employee,Integer> entry: list){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
        //Using Stream API
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::geteSalary)))
                .forEach(s->System.out.println(s));

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::geteSalary).reversed()))
                .forEach(s->System.out.println(s));


    }
}
