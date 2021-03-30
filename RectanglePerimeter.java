package com.stackroute.basics;
import java.util.Scanner;
public class RectanglePerimeter {
    public double length;
    public double breadth;
    public double result;
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }
    //get user input from console
    public void getValues() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length and breadth");
        length=scanner.nextDouble();
        breadth=scanner.nextDouble();
        result=new RectanglePerimeter().perimeterCalculator(length,breadth);
        System.out.println(result);
    }
    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {

        return  2*(length+breadth);
    }
}
