package com.stackroute.arrays;
import java.util.Scanner;
public class RearrangeArrayElements {
    private int size;
    private int arr[];
    public static void main(String[] args) {
        RearrangeArrayElements rearrangeArrayElements=new RearrangeArrayElements();
        rearrangeArrayElements.inputAcceptor();
    }

    //write logic to get inputs from user and send inputs for validation
    public void inputAcceptor() {
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        boolean sizeVal=inputArraySizeValidator(size);
        if(sizeVal){
            arr=new int[size];
            for (int i=0;i<=size-1;i++){
                arr[i]=scanner.nextInt();
            }
            if(inputArrayValidator(arr)){
                computeRearrangedArray(arr);
                displayResult(arr);
            }
            else
                System.out.println("Give proper input");
        }
        else
            System.out.println("Give proper input");

    }

    //write logic to validate the given array size is valid or not
    public boolean inputArraySizeValidator(int size) {
        if(size<=0) return false;
        else return true;
    }

    //write logic to validate the given input array is sorted or not
    public boolean inputArrayValidator(int[] input) {
        if (input==null )return false;
        if(input.length==1 ||input.length==0)return true;
        for (int i=0;i<input.length-1;i++){
            if(input[i]>input[i+1])
                return false;
        }
        return true;
    }

    //write logic to rearrange elements of array and return the result array
    public int[] computeRearrangedArray(int[] inputArray) {
        if(inputArray==null ||inputArray.length==0)return null;
        int a[]=new int[inputArray.length];
        int j=0;
        for (int i:inputArray){
            a[j++]=i;
        }
        boolean temp=true;
        int low=0,high=inputArray.length-1;
        for (int i=0;i<inputArray.length;i++){
            if (temp)
                inputArray[i]=a[high--];
            else
                inputArray[i]=a[low++];
            temp=!temp;
        }

        return inputArray;
    }

    //write logic to print the result
    public void displayResult(int[] outputArray) {
        for (int element:outputArray) {
            System.out.print(element+" ");
        }
    }
}
