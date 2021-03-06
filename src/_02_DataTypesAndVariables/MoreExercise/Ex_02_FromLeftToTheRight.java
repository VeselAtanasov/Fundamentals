package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class Ex_02_FromLeftToTheRight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int linesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= linesCount; i++) {
            double num1 = Double.parseDouble(scanner.next());
            double num2 = Double.parseDouble(scanner.next());

            int sum = 0;
            if (num1 > num2) {
                double numFirst = Math.abs(num1);
                while (numFirst > 0) {

                    sum += (numFirst % 10);
                    numFirst /= 10;
                }

            } else {
                double numSecond = Math.abs(num2);
                while (numSecond > 0) {

                    sum += (numSecond % 10);
                    numSecond /= 10;
                }
            }
            System.out.println(Math.abs(sum));
        }
    }
}
