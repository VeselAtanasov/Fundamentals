package _04_Methods.Lab;

import java.util.Scanner;

public class Ex_11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        String operator = scanner.next();
        double n2 = scanner.nextDouble();

        double result = mathOperations(operator, n1, n2);
        System.out.printf("%.0f", result);
    }

    private static double mathOperations(String operator, double n1, double n2) {
        double result = 0;
        if (operator.equals("/")) {
            result = n1 / n2;
        } else if (operator.equals("*")) {
            result = n1 * n2;
        } else if (operator.equals("+")) {
            result = n1 + n2;
        } else if (operator.equals("-")) {
            result = n1 - n2;
        }
        return result;
    }
}