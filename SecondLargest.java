package com.company;
import java.util.Scanner;

public class SecondLargest {
    private int arr[]=new int[20];
    private int num;
    public void read(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter size of array");
            num=sc.nextInt();
            if(num>0 && num<=20){
                break;
            }
            if (num<0){
                System.out.println("pls enter positive number only");
            }
            if(num>20)
                System.out.println("size exceeded pls enter number within 20");
        }
        System.out.println("------------------------------");
        System.out.println("enter elements");
        for(int i=0;i<num;i++){
            System.out.print("<"+(i+1)+">");
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        SecondLargest secondLargest=new SecondLargest();
        secondLargest.read();
        secondLargest.bubbleSort();
        int element=secondLargest.searchSecond();
        System.out.println("Second largest element : "+element);
    }
    public int searchSecond(){
        return arr[num-2];
    }
    public void bubbleSort(){
        System.out.println("sorting...");
        for(int i=1;i<num;i++){
            for(int j=0;j<num-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
