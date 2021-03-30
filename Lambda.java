package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Lambda {
    public static void main(String[] args) {
       // int arr[]=new int[5];
       // System.out.println("enter elements");
       // for (int i=0;i<5;i++){
       //     arr[i]=new Scanner(System.in).nextInt();
        //}
       // Arrays.stream(arr).forEach(item-> {
       //     if(item%2==0) System.out.println(item+" even");

       // });
       List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(9);
        list.forEach((item)-> {
        if(item%2==0)System.out.println(item+" even");});
    }
}
