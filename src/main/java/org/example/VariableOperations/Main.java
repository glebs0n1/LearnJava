package org.example.VariableOperations;
//Write a program that swaps the values of two variables without using a third variable. For example, if a is initially 5 and b is initially 10,
// after the swap, a should be 10, and b should be 5.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Display the swapped values
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}




