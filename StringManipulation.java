package com.company;

import java.util.Locale;

public class StringManipulation {
    public int vowelCount(String name){

        name=name.toLowerCase();
        int count=0;
        char ch;
        for (int i=0;i<name.length();i++){
            ch=name.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u') count++;
        }
        return count;
    }
    public int characterCount(String str){
        int i=0;
        for (char c:str.toCharArray())
            i++;
        return i;
    }

    public static void main(String[] args) {
        StringManipulation stringManipulation=new StringManipulation();
        System.out.println(stringManipulation.characterCount("aswathi"));
    }
}
