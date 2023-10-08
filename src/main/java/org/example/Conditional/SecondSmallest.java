package org.example.Conditional;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr = {4,7,83,23,11,62,10,8};
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("The Second smallest element in array is:" + secondSmallest);
    }

    public static int findSecondSmallest(int[]arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }
            else if (num < secondSmallest && num != smallest) {
    secondSmallest = num;
            }
        }
            return secondSmallest;
    }
}
