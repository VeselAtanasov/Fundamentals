package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_07_NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String line = matrix(n);
        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }

    private static String matrix(int n) {
        String line = "";
        for (int i = 0; i < n; i++) {
            line += n + " ";
        }
        return line;
    }
}