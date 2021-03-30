package _01_BasicSyntax.Lab;

import java.util.Scanner;

public class Ex_11_MultiplicationTableVerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        do {
            System.out.printf("%d X %d = %d\n", number, multiplier, number * multiplier);
            multiplier++;
        }
        while (multiplier <= 10);
    }
}
