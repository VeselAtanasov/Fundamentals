package _05_Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstDeck = scanner.nextLine().split(" ");
        String[] secondDeck = scanner.nextLine().split(" ");

        ArrayList<String> firstPlayer = new ArrayList<>(Arrays.asList(firstDeck));
        ArrayList<String> secondPlayer = new ArrayList<>(Arrays.asList(secondDeck));

        //compare the cards from the first deck with the cards from the second
        while (firstPlayer.size() != 0 || secondPlayer.size() != 0) {
            if (firstPlayer.size() == 0 || secondPlayer.size() == 0) {
                break;
            }
            int cardFP = Integer.parseInt(firstPlayer.get(0));
            int cardSP = Integer.parseInt(secondPlayer.get(0));
            if (cardFP > cardSP) {
                firstPlayer.add(String.valueOf(cardFP));
                firstPlayer.add(String.valueOf(cardSP));
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else if (cardFP == cardSP) {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                secondPlayer.add(String.valueOf(cardSP));
                secondPlayer.add(String.valueOf(cardFP));
                secondPlayer.remove(0);
                firstPlayer.remove(0);
            }
        }
        //who's winner
        String winner;
        if (firstPlayer.size() == 0) {
            winner = "Second";
        } else {
            winner = "First";
        }
        //summing the cards
        int sum = 0;
        if (winner.equals("First")) {
            for (String card : firstPlayer) {
                int cardAsNum = Integer.parseInt(card);
                sum += cardAsNum;
            }
        } else {
            for (String card : secondPlayer) {
                int cardAsNum = Integer.parseInt(card);
                sum += cardAsNum;
            }
        }
        //winner announcement
        System.out.printf("%s player wins! Sum: %d", winner, sum);
    }
}