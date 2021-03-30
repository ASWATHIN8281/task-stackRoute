package com.stackroute.basics;
import java.util.Scanner;
public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }
    public String getInput() {
        String phn=scanner.next();
        return phn;
    }
    public void displayResult(boolean result) {
       if(result==true)
           System.out.println("Valid");
       else
           System.out.println("Invalid or empty string");
    }
    public boolean validatePhoneNumber(String s) {
        int count=0,dCount=0;
        if(s==null || s.equals(""))
        {
            return false;
        }
        else {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    count++;
                }
                else if(s.charAt(i)=='-')
                    dCount++;
                else
                {
                    return false;
                }
            }
            if(count==10 && dCount==2)
                return true;
            else
                return  false;
        }

    }
}
