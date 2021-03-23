package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 30;

        if (minutes >= 60) {
            minutes = minutes - 60;
            hour++;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);

    }
}
