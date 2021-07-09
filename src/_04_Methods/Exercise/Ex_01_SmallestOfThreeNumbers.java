package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(number1, number2, number3);
    }

    //print smallest number
    public static void printSmallestNumber(int number1, int number2, int number3) {
        //дали първото е най-малко -> ако е по-малко от другите 2
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
        }
        //дали второто е най-малко -> ако е по-малко от другите
        else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
    }
}

