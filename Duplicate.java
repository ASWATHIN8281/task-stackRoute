package com.company;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,1,3,5,6,3);
        int arr[] ={1,1,3,3,5,6};
        Duplicate duplicate=new Duplicate();
        duplicate.duplicateValue(list);
        duplicate.arrayduplicate(arr);
    }
    public void  arrayduplicate(int[]arr){
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.print(arr[j]);
                }
            }
        }
    }
    public void duplicateValue(List<Integer>list){
        Set set=new HashSet(list);
        int i=0;
        if(set.size()<list.size())
               i=1;
        if(i==1)
            System.out.println(set);
        else
            System.out.println("not preseent");


    }
}
