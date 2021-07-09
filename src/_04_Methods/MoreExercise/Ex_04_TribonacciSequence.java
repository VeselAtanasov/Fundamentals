package _04_Methods.MoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        tribonacciSequence(num);
    }

    private static void tribonacciSequence(int num) {
        List<Integer> numbers = new ArrayList<>(num);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        for (int i = 0; i < num; i++) {
            int result = numbers.get(i) + numbers.get(i+1) + numbers.get(i+2);
            numbers.add(result);
        }
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", numbers.get(i));
        }
    }
}