package com.company;
public class Sort {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int num: arr) {
            System.out.print(num+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,1,4,7};
        Sort.sort(arr);
    }
}
