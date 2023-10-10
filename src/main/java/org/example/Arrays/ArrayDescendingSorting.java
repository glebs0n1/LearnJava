package org.example.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDescendingSorting {
    public static void main(String[] args) {
        Integer [] arr = {4,6,1,2,7,3,8,11,8};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Sorted array in descending " + Arrays.toString(arr));
    }
}
