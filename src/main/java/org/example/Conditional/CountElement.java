package org.example.Conditional;

public class CountElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 7, 24, 2, 6, 9, 8, 8};
        int target = 2;

        int count = countElement(arr, target);
        System.out.println("the " + target + ", are founded " + count + " times in array");
    }

    public static int countElement(int[] arr, int target) {
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;

            }
        }
        return count;
    }
}
