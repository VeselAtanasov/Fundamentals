package _03_Arrays.MoreExercise;

import java.util.Scanner;

public class Ex_02_PascalTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfRows = Integer.parseInt(scanner.nextLine());

        long[] first = new long[]{1};
        System.out.println(first[0]);

        long[] second = new long[]{1, 1};
        System.out.println(second[0] + " " + second[1]);

        long[] tempArray = second;

        for (int rows = 3; rows <= numberOfRows; rows++) {
            long[] newArray = new long[rows];
            newArray[0] = 1;
            newArray[rows - 1] = 1;
            for (int i = 1; i <= newArray.length - 2; i++) {

                newArray[i] = tempArray[i] + tempArray[i - 1];
            }
            for (int i = 0; i < newArray.length - 1; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println(newArray[newArray.length - 1]);
            tempArray = newArray;
        }
    }
}
