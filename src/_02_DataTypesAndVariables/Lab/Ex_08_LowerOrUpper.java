package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Ex_08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.next().charAt(0);

        if (a >= 97 && a <= 122) {
            System.out.println("lower-case");
        } else if (a >= 65 && a <= 90) {
            System.out.println("upper-case");
        }
    }
}