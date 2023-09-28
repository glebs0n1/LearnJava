package org.example.VariableOperations;
//Build a basic calculator that takes two numbers and an operator (+, -, *, /) as input from the user and performs the corresponding operation. Display the result.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String expression = scanner.nextLine();

        scanner.close();

        try {
            String[] parts = expression.replaceAll("\\s+", "").split("[-+*/]");

            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid expression format.");
            }

            double num1 = Double.parseDouble(parts[0]);
            char operator = expression.replaceAll("[^\\-+*/]", "").charAt(0);
            double num2 = Double.parseDouble(parts[1]);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator.");
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}