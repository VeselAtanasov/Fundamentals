package _04_Methods.Lab;

import java.util.Scanner;

public class Ex_04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String act = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        printResult(act, a, b);
    }

    private static void printResult(String act, int a, int b) {
        int result = 0;
        if (act.equals("add")) {
            result = addMethod(a, b);
        } else if (act.equals("multiply")) {
            result = multiplyMethod(a, b);
        } else if (act.equals("substract")) {
            result = substractMethod(a, b);
        } else if (act.equals("divide")) {
            result = divideMethod(a, b);
        }
        System.out.println(result);
    }

    private static int divideMethod(int a, int b) {
        return a / b;
    }

    private static int substractMethod(int a, int b) {
        return a - b;
    }

    private static int multiplyMethod(int a, int b) {
        return a * b;
    }

    private static int addMethod(int a, int b) {
        return a + b;
    }
}