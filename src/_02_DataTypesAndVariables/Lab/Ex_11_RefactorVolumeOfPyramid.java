package _02_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Ex_11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length,width,height ;

        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());

        double B = width * length;
        double totalVolume = (B * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", totalVolume);

    }
}
