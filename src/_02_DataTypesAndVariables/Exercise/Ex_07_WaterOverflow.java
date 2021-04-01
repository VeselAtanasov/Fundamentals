package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTankCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int waterTank = 255;

        for (int i = 1; i <= waterTankCount; i++) {
            int litres = Integer.parseInt(scanner.nextLine());

            if (sum + litres > waterTank) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += litres;
            }
        }
        System.out.println(sum);
    }
}

