package _04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        double power = scanner.nextDouble();

        double result = valueOfRaisedNumber(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double valueOfRaisedNumber(double number, double power) {
        return Math.pow(number, power);
    }
}
