package org.example.While;
//Create a programme that asks user to enter a password.
// Keeps asking for the password until the user enters the correct password.
import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        String correctPassword = "MyPass";
        Scanner scanner = new Scanner(System.in);
        String enteredPassword;

        do {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("correct pass");
                break;
            } else {
                System.out.println("wrong pass");
            }
        } while (true);

        scanner.close();
    }
}
