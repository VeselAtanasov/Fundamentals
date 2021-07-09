package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        printCountVowels(text);
    }
    //print count of vowels in text
    private static void printCountVowels(String text) {
        //1. обхожда текст (взимаме всички символи)
        //2. проверка дали символа е гласна буква (a, e, i, o, u) -> увеличавам броя с 1
        //3. принтирам броя на гласните букви

        int count = 0; //броя на гласните букви
        for (int index = 0; index <= text.length() - 1; index++) {
            char currentSymbol = text.charAt(index);
            switch (currentSymbol) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println(count);
    }
}
