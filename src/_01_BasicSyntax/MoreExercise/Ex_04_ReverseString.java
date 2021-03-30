package _01_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class Ex_04_ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        System.out.println(reverse);

    }
}
