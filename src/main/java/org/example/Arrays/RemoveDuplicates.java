package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = { 1,3,5,7,6,1,7,8};

        int [] uniqueArr = removeDuplicates(arr);

        System.out.println("Provided Array" + Arrays.toString(arr));
        System.out.println("Array without duplicates" + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }
}
