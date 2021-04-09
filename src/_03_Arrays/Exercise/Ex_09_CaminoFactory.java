package _03_Arrays.Exercise;

import java.util.Scanner;

public class Ex_09_CaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        String input;
        int bestSequenceIndex = Integer.MAX_VALUE;
        int bestSequenceSum = 0;
        int bestIndexInARow = 0;
        int bestIndexInARowOutput = 0;
        StringBuilder sequenceOutput = new StringBuilder();

        while (!"Clone them!".equals(input = scanner.nextLine())) {
            ++bestIndexInARow;

            String[] data = input.split("!+");

            int[] sequenceDNA = new int[size];

            for (int i = 0; i < data.length; i++) {
                sequenceDNA[i] = Integer.parseInt(data[i]);
            }
            int maxCount = 0;
            int sequenceIndex = 0;
            for (int i = 0; i < sequenceDNA.length; i++) {
                int currentCount = 0;
                for (int j = i; j < sequenceDNA.length; j++) {
                    if (sequenceDNA[i] == sequenceDNA[j]) {
                        currentCount++;
                        if (currentCount > maxCount) {
                            maxCount = currentCount;
                            sequenceIndex = i;
                        }
                    } else {
                        break;
                    }
                }
            }
            int sequenceSum = 0;

            for (int i = 0; i < sequenceDNA.length; i++) {

                if (sequenceDNA[i] == 1) {
                    sequenceSum += sequenceDNA[i];
                }
            }
            if (sequenceIndex < bestSequenceIndex || sequenceSum > bestSequenceSum) {
                sequenceOutput = new StringBuilder();
                bestSequenceIndex = sequenceIndex;
                bestSequenceSum = sequenceSum;
                bestIndexInARowOutput = bestIndexInARow;

                for (int i = 0; i < sequenceDNA.length; i++) {
                    sequenceOutput.append(sequenceDNA[i]).append(" ");
                }
            }
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestIndexInARowOutput, bestSequenceSum);
        System.out.println(sequenceOutput.toString().trim());
    }
}