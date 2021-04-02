package _02_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Ex_09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalYield = 0;
        int consumeWorkers = 26;
        int consumeDay = 10;
        int days = 0;

        if (startingYield >= 100) {
            do {
                days++;
                totalYield = (totalYield + startingYield) - consumeWorkers;
                startingYield = startingYield - consumeDay;

            } while (startingYield >= 100);
            totalYield -= consumeWorkers;
            System.out.printf("%d\n%d", days, totalYield);
        } else {
            System.out.printf("%d\n%d", 0, 0);
        }
    }
}



