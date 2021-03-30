package com.company;
import java.util.Scanner;
public class IndexOfChar {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        str = sc.nextLine();
        System.out.println("enter character");
        char c = sc.next().charAt(0);
        int index=indexSearching(str,c);
        System.out.println(index);

    }
    public static int indexSearching(String str, char c){
        int set = 0,i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==c)
            {
                set=1;
                break;
            }
        }
        if (set==1)
            return i;
        else
            return -1;
    }

}
