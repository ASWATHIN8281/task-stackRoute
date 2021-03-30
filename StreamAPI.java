package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("sachin");
        list.add("aleena");
        list.add("seema");
        List<String>stringList=list.stream().filter(s->s.startsWith("s")).collect(Collectors.toList());
        System.out.println(stringList);
        List<String>sort=list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
        List<Integer>list1= Arrays.asList(2,3,5);
        List<Integer>sqr=list1.stream().map(s->s*s).collect(Collectors.toList());
        System.out.println(sqr);

//        List<Integer>even=list1.stream().map(value->{
//            if(value%2==0)
//                return value;
//            return null;
//        }).collect(Collectors.toList());
//        System.out.println(even);
//        Stream stream= (Stream) list1.stream().filter(s->s%2==0)
//                .peek(s-> System.out.println("Even"+ s)).collect(Collectors.toList());
        Map<Boolean,Integer> stringIntegerMap=new HashMap<>();
        stringIntegerMap=list1.stream()
                .collect(Collectors.partitioningBy(x->x%2==0,Collectors.summingInt(Integer::intValue)));
        System.out.println(stringIntegerMap);

        List<String>list2=new ArrayList<>();
        //Map<Object,>map=new HashMap<>();
        list2=  list1.stream().map(x->x%2==0?"even"+x:"odd"+x).collect(Collectors.toList());
        System.out.println(list2.toString());

    }
}
