package _04_Methods.Lab;

import java.util.Scanner;

public class Ex_06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int length = scanner.nextInt();

        int area = rectagleArea(width, length);
        System.out.println(area);
    }

    private static int rectagleArea(int width, int length) {
        int area = width * length;
        return area;
    }
}

