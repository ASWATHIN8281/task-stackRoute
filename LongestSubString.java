package com.stackroute.strings;

import java.util.Scanner;

public class LongestSubString {

    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        StringBuilder builder=new StringBuilder(str);
        new StringBuilder( new LongestSubString().findLongestSubString(builder));
    }
    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
        int length=input.length();
        if(length!=0)
        {   int tester=0;
            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < length; i++) {
                builder2.append(input.charAt(i));
                int len = builder2.length();
                if (i <=(length / 2) && builder2.toString().equals(input.substring(length - len, length).toString()))
                {   builder1.append(builder2);
                    tester=1;
                }
            }
            if(tester==1){

               return builder1;

            }
            else
                return new StringBuilder("Longest substring is not present in the given StringBuilder");
        }
        else
            return new StringBuilder("Give proper input");
    }
}
