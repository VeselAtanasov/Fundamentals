package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number != 0){
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
