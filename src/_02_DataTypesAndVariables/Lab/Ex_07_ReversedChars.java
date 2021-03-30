package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Ex_07_ReversedChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);

        System.out.printf("%s %s %s", c, b, a);

    }
}
