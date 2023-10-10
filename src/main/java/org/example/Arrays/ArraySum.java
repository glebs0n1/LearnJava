package org.example.Arrays;
//Program that finds the sum of all elements in an array of integers.
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {3,4,7,12,2,1};

        int sum = findSum(arr);
        System.out.println("Sum of all elements " + sum);
    }
    public static int findSum(int []arr){
        int sum = 0;
        for (int num : arr){
            sum +=num;
        }
        return sum;
    }
}
