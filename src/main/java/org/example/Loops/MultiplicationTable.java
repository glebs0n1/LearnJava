package org.example.Loops;
//Generate and display the multiplication table for a given number (up to a specified limit) using nested for loops.
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for the multiplication table: ");
        int number = scanner.nextInt();

        System.out.print("Enter the limit for the table: ");
        int limit = scanner.nextInt();

        scanner.close();

        System.out.println("Multiplication Table for " + number + " (up to " + limit + "):");

        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}