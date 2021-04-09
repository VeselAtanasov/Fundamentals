package _03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_06_EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] numbers2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

//        String input = scanner.nextLine();
//        String[] splitInput = input.split(" ");
//        int secondArray[] = new int[splitInput.length];
//        for (int i = 0; i < splitInput.length; i++) {
//            secondArray[i] = Integer.parseInt(splitInput[i]);
//        }

        int sum = 0;
        boolean areIdentical = true;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] != numbers2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
