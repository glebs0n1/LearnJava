package org.example.Conditional;

public class SmallestNumber {
        public static void main(String[] args) {
            int[] numbers = {45, 67, 12, 89, 34, 56, 78};
            int min = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("Smallest number:" + min);
        }
    }
