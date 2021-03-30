package _01_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class Ex_05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfTouch = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbersOfTouch; i++) {
            String digits = scanner.nextLine();
            int digitLength = digits.length();
            char oneDigit = digits.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            int offSet = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offSet = (mainDigit - 2) * 3 + 1;
            }
            int letterIndex = offSet + digitLength - 1;
            int letterCode = letterIndex + 97;

            char letter = (char) letterCode;
            if (mainDigit == 0) {
                letter = (char) (mainDigit + 32);
            }
            message.append(letter);
        }
        System.out.println(message);
    }
}
