package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = sumMethod(a, b);
        int result = subtractMethod(sum, c);
        System.out.println(result);
    }

    private static int subtractMethod(int sum, int c) {
        return sum - c;
    }

    private static int sumMethod(int a, int b) {
        return a + b;
    }
}
