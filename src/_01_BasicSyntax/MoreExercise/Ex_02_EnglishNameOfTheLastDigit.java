package _01_BasicSyntax.MoreExercise;

import java.util.Scanner;

public class Ex_02_EnglishNameOfTheLastDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numberAsString = scanner.nextLine();

        char lastDigit = numberAsString.toCharArray()[numberAsString.length() - 1];
        String output;

        if (lastDigit == '0') {
            output = "zero";
        } else if (lastDigit == '1') {
            output = "one";
        } else if (lastDigit == '2') {
            output = "two";
        } else if (lastDigit == '3') {
            output = "three";
        } else if (lastDigit == '4') {
            output = "four";
        } else if (lastDigit == '5') {
            output = "five";
        } else if (lastDigit == '6') {
            output = "six";
        } else if (lastDigit == '7') {
            output = "seven";
        } else if (lastDigit == '8') {
            output = "eight";
        } else if (lastDigit == '9') {
            output = "nine";
        } else {
            output = null;
        }
        System.out.println(output);
    }
}