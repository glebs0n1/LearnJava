package org.example.Loops;
//Write a program that calculates and prints the sum of all even numbers from 1 to 50 using a for loop.
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            // Check if the current number (i) is even
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Print the sum of even numbers
        System.out.println("Sum of even numbers from 1 to 50: " + sum);
    }
}