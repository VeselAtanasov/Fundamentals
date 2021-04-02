package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokemonPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactory = Integer.parseInt(scanner.nextLine());

        int targets = 0;
        double originalValue = pokemonPower * 0.50;

        while (pokemonPower >= distance) {
            if (pokemonPower == originalValue && exhaustionFactory > 0) {
                    pokemonPower = pokemonPower / exhaustionFactory;
                    if (pokemonPower < distance) {
                        break;
                    }
                }
                pokemonPower -= distance;
                targets++;
            }
        System.out.println(pokemonPower);
        System.out.println(targets);

    }
}
