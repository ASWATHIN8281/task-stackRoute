package com.company;
import java.util.Scanner;
public class App 
{
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
    public void display(){
        System.out.print("elements: ");
        for (int i=0;i<num;i++){
            System.out.print(arr[i]);
            System.out.print("  ");
        }
        System.out.println();
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
    public int arraySize(){
        return num;
    }
    public void binarySearch(int i,int j) {
        int lowerBound = i;
        int upperBound = j;
        int mid;
        char res;
        do {
            int com_count=0;
            System.out.println("Enter element to be searched");
            int item = (new Scanner(System.in)).nextInt();
            while (lowerBound <= upperBound) {
                System.out.print("");
                com_count++;
                mid = (lowerBound + upperBound) / 2;
                if (arr[mid] == item) {
                    System.out.println("element " + item + " found at index " + mid);
                    System.out.println("no.of comparisons: "+com_count);
                    break;
                }
                if (item < arr[mid]) {
                    upperBound = mid - 1;

                }
                if (item > arr[mid])
                    lowerBound = mid + 1;
            }
            if(lowerBound>upperBound){
               System.out.println("Element not found");}
            System.out.println("Do you want to continue(y/n)");
            res = (new Scanner(System.in).nextLine().charAt(0));
        } while (res == 'y' || res == 'Y');
    }
    public static void main( String[] args )
    {
        App app=new App();
        app.read();
        System.out.println("Before sorting.............");
        app.display();
        app.bubbleSort();
        System.out.println("After sorting.............");
        app.display();
        app.binarySearch(0,app.arraySize()-1);

    }
}
