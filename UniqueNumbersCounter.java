package com.stackroute.collections;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class UniqueNumbersCounter {
    //write logic to find maximum unique numbers count from given array in the sub array of certain length
    public String findUniqueNumbersCount(int[] inputArray, int subArrayLength) {
        int counter=0;
       if(inputArray==null)
           return"Give proper input not null array";
       if(inputArray.length==0)
           return "Give proper input not empty array";
       else{
           if(subArrayLength>inputArray.length)
               return "Give proper input, sub array length exceeds array length";
           if (subArrayLength<=0)
               return "Give proper input, sub array length can not be negative or zero";
           else{

               int maxUnique=0;
               for(int i=0;i<=(inputArray.length-subArrayLength);i++){
                   int currentUnique=0;
                   Deque<Integer> deque=new ArrayDeque<>();
                   for(int k=i;k<(i+subArrayLength);k++) {
                       if (!deque.contains(inputArray[k])) {
                           deque.addFirst(inputArray[i]);
                           currentUnique++;
                       }
                   }
                   if(currentUnique>maxUnique)
                        maxUnique=currentUnique;
               }
               return "Count of Unique Numbers is "+maxUnique;
           }
       }
    }
}
