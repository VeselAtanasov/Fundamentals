package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Ex_02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usdDollars = Double.parseDouble(scanner.nextLine());
        double britishDollars = 1.31;

        double total = usdDollars * britishDollars;
        System.out.printf("%.3f",total);

    }
}
