package _01_BasicSyntax.Lab;

import java.util.Scanner;

public class Ex_13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.println(2 * i - 1);
            sum = sum + 2 * i - 1;
        }
        System.out.printf("Sum: %d\n", sum);
    }
}
