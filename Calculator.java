package com.stackroute.basics;
import java.util.Scanner;
public class Calculator {
    private static Scanner scan;
    public int firstValue,secondValue,operator;
    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }
    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        char sign='y';
        while (sign=='y') {
            firstValue = scan.nextInt();
            secondValue = scan.nextInt();
            operator = scan.nextInt();
            String temp=new Calculator().calculate(firstValue,secondValue,operator);
            System.out.println(temp);
            sign = scan.next().charAt(0);
        }
    }
    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int result;
        String temp;
        switch(operator) {
            case 1:
                result=firstValue+secondValue;
                temp=firstValue + " + " + secondValue + " = " + result;
                break;

            case 2:
                result=firstValue - secondValue;
                temp=firstValue + " - " + secondValue + " = " +result;
                break;

            case 3:
                result=firstValue*secondValue;
                temp=firstValue + " * " + secondValue + " = " + result;
                break;

            case 4:
                  if(secondValue == 0) {
                      temp = "The divider (secondValue) cannot be zero";
                  }
                  else{
                      result=firstValue/secondValue;
                      temp=firstValue + " / " + secondValue + " = " + result;
                  }
                  break;
            default:
                     temp="Entered wrong option " + operator;
        }
        return temp;
    }
}

