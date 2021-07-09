package _04_Methods.Lab;

import java.util.Scanner;

public class Ex_09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String valueType = scanner.nextLine().toLowerCase();
        if ("int".equals(valueType)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = getMax(a, b);
            System.out.println(result);

        } else if ("char".equals(valueType)) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            char result = getMax(first, second);
            System.out.println(result);

        } else if ("string".equals(valueType)) {
            String firstInput = scanner.nextLine();
            String secondInput = scanner.nextLine();
            String result = getMax(firstInput, secondInput);
            System.out.println(result);
        }
    }

    private static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static String getMax(String firstInput, String secondInput) {
        int longer = firstInput.compareTo(secondInput);
        if (longer > 0) {
            return firstInput;
        }
        return secondInput;
    }
}