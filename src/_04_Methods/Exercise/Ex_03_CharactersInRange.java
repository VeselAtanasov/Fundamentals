package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printSequenceBetweenChars(symbol1, symbol2);
    }
    private static void printSequenceBetweenChars(char symbol1, char symbol2) {
        //проверка и да започваме от символа с по-малък аски код
        if (symbol1 < symbol2) {
            //започвам принтирането от символ1
            for (char symbol = (char) (symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        } else { //symbol2 < symbol1
            //започвам принтирането от символ 2
            for (char symbol = (char) (symbol2 + 1); symbol < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}