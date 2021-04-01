package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_05_PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endCode; code++) {
            System.out.print((char) code + " ");

        }
    }
}
