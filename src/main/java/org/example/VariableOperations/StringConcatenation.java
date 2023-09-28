package org.example.VariableOperations;
//Create a program that takes two strings as input from the user and concatenates them. For example, if the user enters "Hello" and "World," the program should print "HelloWorld
import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        scanner.close();

        String concatenatedString = firstString.concat(secondString);

        System.out.println("Concatenated String: " + concatenatedString);
    }
}