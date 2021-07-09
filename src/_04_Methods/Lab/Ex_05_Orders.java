package _04_Methods.Lab;

import java.util.Scanner;

public class Ex_05_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int amount = scanner.nextInt();

        printTotalPrice(product, amount);
    }

    private static void printTotalPrice(String product, int amount) {
        double pricePerProduct = productPrice(product);
        double sum = pricePerProduct * amount;
        System.out.printf("%.2f", sum);
    }

    private static double productPrice(String product) {
        double productPrice = 0;
        if (product.equals("coffee")) {
            productPrice = 1.50;
        } else if (product.equals("water")) {
            productPrice = 1.00;
        } else if (product.equals("coke")) {
            productPrice = 1.40;
        } else if (product.equals("snacks")) {
            productPrice = 2.00;
        }
        return productPrice;
    }
}
