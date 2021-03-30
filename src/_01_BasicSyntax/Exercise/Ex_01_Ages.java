package _01_BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int person = Integer.parseInt(scanner.nextLine());

        if (person >= 0 && person <= 2) {
            System.out.println("baby");
        } else if (person >= 3 && person <= 13) {
            System.out.println("child");
        } else if (person >= 14 && person <= 19) {
            System.out.println("teenager");
        } else if (person >= 20 && person <= 65) {
            System.out.println("adult");
        } else if (person >= 66) {
            System.out.println("elder");
        }
    }
}

