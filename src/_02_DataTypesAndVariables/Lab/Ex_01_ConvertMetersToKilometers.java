package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Ex_01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = 1.0 * meters / 1000;

        System.out.printf("%.2f",kilometers);

    }
}
