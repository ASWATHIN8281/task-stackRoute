package com.stackroute.strings;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static String phraseOne;
    public static String phraseTwo;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        phraseOne=sc.nextLine();
        phraseTwo=sc.nextLine();
        new Anagram().checkAnagrams(phraseOne,phraseTwo);
    }
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne==null || phraseTwo==null || phraseOne.equals("") || phraseTwo.equals(""))
           return "Give proper input not empty phrases";
        else {
            int length_1 = phraseOne.length();
            int length_2 = phraseTwo.length();
            if (length_1 != length_2)
                return "Given phrases are not anagrams";
            else{
                int temp=0;
                char[] tempArray_1=phraseOne.toCharArray();
                char[] tempArray_2=phraseTwo.toCharArray();
                Arrays.sort(tempArray_1);
                Arrays.sort(tempArray_2);
                String s1=new String(tempArray_1);
                String s2=new String(tempArray_2);
                if(s1.equals(s2))return "Given phrases are anagrams";
                else  return"Given phrases are not anagrams";
//                for(int i=0;i<length_1;i++){
//                    if(tempArray_1[i]!=tempArray_2[i])
//                    {   temp=1;
//                    }
//                }
//                if(temp==0)
//                    return "Given phrases are anagrams";
//                else
//                    return"Given phrases are not anagrams";
             }
        }

    }
}
