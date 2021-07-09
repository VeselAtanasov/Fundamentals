package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String text) {
        //дължината да е нечетна
        if (text.length() % 2 != 0) {
            //елемент на позиция = дължината  / 2
            int indexMiddleCharacter = text.length() / 2;
            System.out.println(text.charAt(indexMiddleCharacter));
        }
        //дължината да е четна
        else {
            //първи елемент на позиция = дължината / 2 -1
            //втория елемент на позиция = дължината / 2
            int indexFirstMiddleCharacter = text.length() / 2 - 1;
            int indexSecondMiddleCharacter = text.length() / 2;
            System.out.printf("%c%c", text.charAt(indexFirstMiddleCharacter), text.charAt(indexSecondMiddleCharacter));
        }
    }
}





