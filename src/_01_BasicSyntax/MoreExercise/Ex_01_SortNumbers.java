package _01_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class Ex_01_SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int[] array = {0, 0, 0};
//        for (int i = 0; i <= 2; i++) {
//            int n = Integer.parseInt(scanner.nextLine());
//            array[i] = n * -1;
//        }
//
//        Arrays.sort(array);
//
//        for (int x = 0; x <= 2; x++) {
//            System.out.println(array[x] * -1);

        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        double n3 = Double.parseDouble(scanner.nextLine());

        if (n1 <= n2 && n2 <= n3) {
            System.out.printf("%.0f\n%.0f\n%.0f", n3, n2, n1);
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.printf("%.0f\n%.0f\n%.0f", n1, n3, n2);
        } else if (n3 <= n1 && n1 <= n2) {
            System.out.printf("%.0f\n%.0f\n%.0f", n2, n1, n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.printf("%.0f\n%.0f\n%.0f", n2, n3, n1);
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.printf("%.0f\n%.0f\n%.0f", n3, n1, n2);
        } else if (n3 <= n2 && n2 <= n1) {
            System.out.printf("%.0f\n%.0f\n%.0f", n1, n2, n3);
        }
    }
}

