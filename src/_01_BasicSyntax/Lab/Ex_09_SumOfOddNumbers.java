package _01_BasicSyntax.Lab;

import java.util.Scanner;

public class Ex_09_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= number ; i++) {
            int oddNumber = 2 * i - 1;
            sum = sum + oddNumber;
            System.out.println(oddNumber);
        }
        System.out.printf("Sum: %d", sum);
    }
}
