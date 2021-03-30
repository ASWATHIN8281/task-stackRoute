package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalClasses {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(1,3,7,10,7);
        List<Optional<Integer>>optionals=list.stream()
                .map(Optional::ofNullable).collect(Collectors.toList());
        System.out.println(optionals);

        Optional<Integer>optional=list.stream().findAny();
        System.out.println(optional);
        System.out.println("Even multiple");
        List<Integer>list1=list.stream().filter(x->x%3==0).filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("max of");
       int i= (int)(long)list.stream().filter(x->x%2!=0).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(i);
        boolean b=list.stream().anyMatch(element->element%2==0);
        System.out.println(b);
    }
}
