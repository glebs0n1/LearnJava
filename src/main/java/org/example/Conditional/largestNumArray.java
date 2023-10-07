package org.example.Conditional;

public class largestNumArray {
    public static void main(String[] args) {
            int[] numbers = {45, 67, 12, 89, 34, 56, 78};
            int max = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("Largest num:" + max);
        }
    }
