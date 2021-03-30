package com.company;

public class CalculatorApp {

    public double sum(double a,double b){

        return a+b;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double multiple(double a,double b){

        return  a*b;
    }
    public double division(double a,double b){
        if(b==0) throw new IllegalArgumentException("Divisor cannot divide by zero");
        return (double)a/b;
    }
    public static void main(String[] args) {
      CalculatorApp calculatorApp=new CalculatorApp();
        System.out.println(calculatorApp.subtract(1.3,1.2));
    }
}
