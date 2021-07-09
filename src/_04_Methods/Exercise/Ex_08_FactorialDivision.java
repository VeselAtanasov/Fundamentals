package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        division(firstFactorial(firstNumber), secondFactorial(secondNumber));
    }

    private static void division(long firstFactorial, long secondFactorial) {
        double result = 1.0 * firstFactorial / secondFactorial;
        System.out.printf("%.2f", result);
    }

    private static long firstFactorial(int a) {
        long fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    private static long secondFactorial(int b) {
        long fact = 1;
        for (int i = 1; i <= b; i++) {
            fact = fact * i;
        }
        return fact;
    }
}