package _01_BasicSyntax.Exercise;

import java.util.Scanner;

public class Ex_09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double lightSabersTotal = Math.ceil(students * 1.1);
        int countFreeBelts = students / 6;

        double sumAllPrice = (priceLightSabers * lightSabersTotal) + ( students * priceRobes) + ((students - countFreeBelts)* priceBelts);

        if (money >= sumAllPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.", sumAllPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", Math.abs(money - sumAllPrice));

        }
    }
}