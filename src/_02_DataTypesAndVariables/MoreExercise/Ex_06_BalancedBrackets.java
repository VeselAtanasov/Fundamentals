package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class Ex_06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countOpenBrackets = 0;
        int countClosedBrackets = 0;

        for (int i = 0; i < n; i++) {

            String inputLine = scanner.nextLine();
            String openBracket = "(";
            String closedBracket = ")";

            if (inputLine.equals(openBracket)) {
                countOpenBrackets++;
            }

            if (inputLine.equals(closedBracket)) {
                countClosedBrackets++;
                if (countOpenBrackets - countClosedBrackets != 0) {
                    break;
                }
            }
        }
        if (countOpenBrackets == countClosedBrackets) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
