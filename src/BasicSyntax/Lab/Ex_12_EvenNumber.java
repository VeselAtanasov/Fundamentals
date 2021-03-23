package BasicSyntax.Lab;

import java.util.Scanner;

public class Ex_12_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (number % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(number));
                break;
            }
            System.out.println("Please write an even number.");
            number = Integer.parseInt(scanner.nextLine());
        }
    }
}
