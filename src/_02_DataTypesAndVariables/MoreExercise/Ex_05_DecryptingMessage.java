package _02_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class Ex_05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        StringBuilder sumMessage = new StringBuilder();

        for (int i = 0; i < lines; i++)
        {
            char input = scanner.nextLine().charAt(0);
            int value = input + key;
            char message = (char)value;

            sumMessage.append(message);
        }
        System.out.println(sumMessage);
    }
}
