package BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_07_VendingMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String coin = scanner.nextLine();
        double sumCoins = 0;

        while (!coin.equals("Start")) {
            double money = Double.parseDouble(coin);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                sumCoins += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            coin = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double productPrice;

        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    productPrice = 0;
                    System.out.println("Invalid product");
                    break;
            }
            if (sumCoins >= productPrice && productPrice > 0) {

                System.out.printf("Purchased %s\n", product);
                sumCoins = sumCoins - productPrice;

            } else if (productPrice > sumCoins) {
                System.out.println("Sorry, not enough money");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}