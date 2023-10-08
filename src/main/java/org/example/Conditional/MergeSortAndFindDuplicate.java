package org.example.Conditional;

import java.util.Arrays;

public class MergeSortAndFindDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 8, 4, 1};
        int[] arr2 = {7, 6, 2, 8, 9,2,4};

        int[] merged = mergeArraysAndSort(arr1, arr2);
        System.out.println("Merge and sort array:");
        printArray(merged);

        int duplicate = findDuplicate(merged);
        if (duplicate != -1) {
            System.out.println("duplicated elements: " + duplicate);
        } else {
            System.out.println("Sorry, duplicated elements not found");
        }
    }

    public static int[] mergeArraysAndSort(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        Arrays.sort(merged);

        return merged;
    }

    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
