package org.example.VariableOperations;
//Write a program that converts a temperature in Celsius to Fahrenheit. You can use the formula: Fahrenheit = (Celsius * 9/5) + 32.
// Take the temperature in Celsius as user input.
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        double celsius = scanner.nextDouble();

        scanner.close();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}