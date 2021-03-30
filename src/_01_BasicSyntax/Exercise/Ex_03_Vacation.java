package _01_BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price;
        double sum = 0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    price = 8.45;
                    if (group >= 30) {
                        price = price - (price * 0.15);
                    }
                    sum = price * group;
                } else if (type.equals("Business")) {
                    price = 10.90;
                    if (group >= 100) {
                        group = group - 10;
                    }
                    sum = price * group;
                } else if (type.equals("Regular")) {
                    price = 15;
                    if (group >= 10 && group <= 20) {
                        price = price - (price * 0.05);
                    }
                    sum = price * group;
                }
                break;

            case "Saturday":
                if (type.equals("Students")) {
                    price = 9.80;
                    if (group >= 30) {
                        price = price - (price * 0.15);
                    }
                    sum = price * group;
                } else if (type.equals("Business")) {
                    price = 15.60;
                    if (group >= 100) {
                        group = group - 10;
                    }
                    sum = price * group;
                } else if (type.equals("Regular")) {
                    price = 20;
                    if (group >= 10 && group <= 20) {
                        price = price - (price * 0.05);
                    }
                    sum = price * group;
                }
                break;

            case "Sunday":
                if (type.equals("Students")) {
                    price = 10.46;
                    if (group >= 30) {
                        price = price - (price * 0.15);
                    }
                    sum = price * group;
                } else if (type.equals("Business")) {
                    price = 16;
                    if (group >= 100) {
                        group = group - 10;
                    }
                    sum = price * group;
                } else if (type.equals("Regular")) {
                    price = 22.50;
                    if (group >= 10 && group <= 20) {
                        price = price - (price * 0.05);
                    }
                    sum = price * group;
                }
                break;
        }
        System.out.printf("Total price: %.2f", sum);
    }
}
