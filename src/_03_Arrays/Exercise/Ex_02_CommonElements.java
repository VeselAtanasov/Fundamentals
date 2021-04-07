package _03_Arrays.Exercise;

import java.util.Scanner;

public class Ex_02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words1 = scanner.nextLine().split(" ");
        String[] words2 = scanner.nextLine().split(" ");

//        String[] words1 = firstRow.split(" ");
//        String[] words2 = secondRow.split(" ");

        for (String word2 : words2) {
            for (String word1 : words1) {
                if (word2.equals(word1)) {
                    System.out.print(word2 + " ");
                    break;
                }
            }
        }
    }
}
