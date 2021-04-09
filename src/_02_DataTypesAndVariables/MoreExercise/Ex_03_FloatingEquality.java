package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class Ex_03_FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        if (a > b) {
            if (a - b <= 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else if (a < b) {
            if (b - a <= 0.000001) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}