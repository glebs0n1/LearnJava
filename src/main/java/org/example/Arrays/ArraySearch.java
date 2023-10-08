package org.example.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = { 4,14,74,11,25};
        int target = 21;

        boolean found = searchElement(arr,target);
        if (found){
            System.out.println(target + " founded");
        }
        else {
            System.out.println( " Sorry " + target + " not founded");
        }
    }
    public static boolean searchElement (int[] arr, int target){
        for (int num : arr) {
        if (num == target){
            return true;
        }
    }
    return false;
}
}
