package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegsCount = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxKegModel = "";


        for (int keg = 1; keg <= kegsCount ; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume){
                maxVolume = volume;
                maxKegModel = model;

            }
        }
        System.out.println(maxKegModel);

    }
}
