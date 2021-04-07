package _03_Arrays.Lab;

import java.util.Scanner;

public class Ex_04_ReverseArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {

            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
 
        }

        System.out.println(String.join(" ", input));
    }
}
