package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_11_SnowBalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberOfSnowballs = Double.parseDouble(scanner.nextLine());
        double maxSnowValue = -1;
        String totalOutput = "";

        for (int i = 0; i < numberOfSnowballs; i++) {

            double snowballSnow = Double.parseDouble(scanner.nextLine());
            double snowballTime = Double.parseDouble(scanner.nextLine());
            double snowballQuality = Double.parseDouble(scanner.nextLine());

            double snowballValue = (Math.pow((snowballSnow / snowballTime), snowballQuality));

            if (snowballValue >= maxSnowValue) {

                maxSnowValue = snowballValue;

                totalOutput = String.format("%.0f : %.0f = %.0f (%.0f)", snowballSnow, snowballTime, maxSnowValue, snowballQuality);
            }
        }
        System.out.print(totalOutput);
    }
}