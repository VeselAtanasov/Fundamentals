package _04_Methods.MoreExercise;

import java.util.Locale;
import java.util.Scanner;

public class Ex_01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        dataType(scanner, input);
    }

    private static void dataType(Scanner scanner, String input) {
        input = input.toLowerCase(Locale.ROOT);
        if (input.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            double result = number * 1.5;
            System.out.printf("%.2f", result);
        } else if (input.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            int result = number * 2;
            System.out.printf("%d", result);
        } else {
            String word = scanner.nextLine();
            System.out.printf("$%s$", word);
        }
    }
}
