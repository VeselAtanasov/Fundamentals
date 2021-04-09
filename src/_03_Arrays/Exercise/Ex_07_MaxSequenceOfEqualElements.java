package _03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int len = 1;
        int bestStart = 0;
        int bestLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                len++;
                if (len > bestLength) {
                    bestLength = len;
                    bestStart = numbers[i];
                }
            } else {
                len = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(bestStart + " ");
        }
    }
}