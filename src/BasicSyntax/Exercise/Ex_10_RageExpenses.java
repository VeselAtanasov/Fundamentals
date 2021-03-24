package BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headSetCount = lostGamesCount / 2;
        double sumPriceHeadSet = headSetCount * headsetPrice;

        int mouseCount = lostGamesCount / 3;
        double sumPriceMouse = mouseCount * mousePrice;

        int keyboardCount = lostGamesCount / 6;
        double sumPriceKeyboard = keyboardCount * keyboardPrice;

        int displayCount = lostGamesCount / 12;
        double sumPriceDisplay = displayCount * displayPrice;

        double totalSum = sumPriceHeadSet + sumPriceMouse + sumPriceDisplay + sumPriceKeyboard;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);

    }
}
