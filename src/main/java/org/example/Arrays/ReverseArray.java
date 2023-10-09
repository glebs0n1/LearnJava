package org.example.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Initial Array:");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Reverted Array:");
        printArray(arr);
    }
    public static void reverseArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    }

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}
