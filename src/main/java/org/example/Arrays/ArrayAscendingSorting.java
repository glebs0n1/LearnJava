package org.example.Arrays;
//Program that sorts an array of integers in ascending order.

import java.util.Arrays;

public class ArrayAscendingSorting {
    public static void main(String[] args) {
        int [] arr = {6,8,9,1,7,2,3,11};

        sortArray(arr);

        System.out.println("Sorting array:" + Arrays.toString(arr));
    }
    public static void sortArray(int[]arr){
        Arrays.sort(arr);
    }
}
