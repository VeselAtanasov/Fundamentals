package _05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("end")) {
            if (input[0].equals("Contains")) {
                boolean containsNumber = numbers.contains(Integer.valueOf(input[1]));
                if (containsNumber) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (input[1].equals("even")) {
                String evenNumbers = "";
                for (Integer number : numbers) {
                    if (number % 2 == 0) {
                        evenNumbers += number + " ";
                    }
                }
                System.out.println(evenNumbers);
            } else if (input[1].equals("odd")) {
                String oddNumbers = "";
                for (Integer number : numbers) {
                    if (number % 2 != 0) {
                        oddNumbers += number + " ";
                    }
                }
                System.out.println(oddNumbers);
            } else if (input[1].equals("sum")) {
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println(sum);
            } else if (input[0].equals("Filter")) {
                if (input[1].equals("<")) {
                    int limit = Integer.parseInt(input[2]);
                    String smallerNumbers = "";
                    for (int number : numbers) {
                        if (number < limit) {
                            smallerNumbers += number + " ";
                        }
                    }
                    System.out.println(smallerNumbers);

                } else if (input[1].equals(">")) {
                    int limit = Integer.parseInt(input[2]);
                    String biggerNumbers = "";
                    for (int number : numbers) {
                        if (number > limit) {
                            biggerNumbers += number + " ";
                        }
                    }
                    System.out.println(biggerNumbers);

                } else if (input[1].equals(">=")) {
                    int limit = Integer.parseInt(input[2]);
                    String biggerNumbers = "";
                    for (int number : numbers) {
                        if (number >= limit) {
                            biggerNumbers += number + " ";
                        }
                    }
                    System.out.println(biggerNumbers);

                } else if (input[1].equals("<=")) {
                    int limit = Integer.parseInt(input[2]);
                    String smallerNumbers = "";
                    for (int number : numbers) {
                        if (number <= limit) {
                            smallerNumbers += number + " ";
                        }
                    }
                    System.out.println(smallerNumbers);
                }
            }
            input = scanner.nextLine().split(" ");
        }
    }
}