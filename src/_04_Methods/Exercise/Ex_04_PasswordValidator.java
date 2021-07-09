package _04_Methods.Exercise;

import java.util.Scanner;

public class Ex_04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //проверка за дължина -> от 6 до 10 вкл символа
        //ако дължината ми не е валидна -> print
        boolean isValidLength = isValidLength(password);
        if (!isValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //проверка дали съдържа само букви и цифри
        boolean isValidContent = isValidContent(password);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }
        //проверка дали има поне 2 цифри
        boolean isValidCount = isValidCountDigits(password);
        if (!isValidCount) {
            System.out.println("Password must have at least 2 digits");
        }
        //ако паролата е валидна по всички параметри
        if (isValidLength && isValidContent && isValidCount) {
            System.out.println("Password is valid");
        }
    }

    //метод за проверка на дължината -> true(валидна дължина) и false(невалидна)
    private static boolean isValidLength(String password) {
        //валидна
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else { //невалидна
            return false;
        }
    }

    //метод за проверка на съдържание за букви и цифри -> true(валидна) и false(невалидна)
    private static boolean isValidContent(String password) {
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol = password.charAt(index);
            //ако символа ми е различен от буква или цифра
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        //обходила всички символи и никой не ми е бил различен от буква или цифра
        return true;
    }

    //метод за проверка на броя на цифрите в паролата -> true(валидна) и false(невалидна)
    private static boolean isValidCountDigits(String password) {
        //true -> броя на цифрите >= 2
        //false -> броя на цифрите < 2
        int count = 0;
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol = password.charAt(index);
            //проверка за цифра
            if (Character.isDigit(currentSymbol)) {
                count++;
            }
        }
        //броя на цифрите
        return count >= 2;
    }
}
