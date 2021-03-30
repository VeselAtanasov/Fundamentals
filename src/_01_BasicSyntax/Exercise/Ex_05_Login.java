package _01_BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            password.append(username.charAt(i));
        }
        String input = scanner.nextLine();

        int numOfTries = 1;
        while (!input.equals(password.toString())) {
            if (numOfTries < 4) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s blocked!", username);
                return;
            }
            input = scanner.nextLine();
            numOfTries++;
        }
        System.out.printf("User %s logged in.", username);
    }
}
