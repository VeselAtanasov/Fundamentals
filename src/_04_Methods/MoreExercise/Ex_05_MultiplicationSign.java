package _04_Methods.MoreExercise;

import java.util.Scanner;

public class Ex_05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(checkNums(n1, n2, n3));
    }

    private static String checkNums(int n1, int n2, int n3) {
        String result;
        int first = Math.multiplyExact(n1, n2);
        int second = Math.multiplyExact(first, n3);

        if (second < 0) {
            result = "negative";
        } else if (second == 0) {
            result = "zero";
        } else {
            result = "positive";
        }
        return result;
    }
}