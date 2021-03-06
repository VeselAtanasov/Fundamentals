package _05_Lists.Lab;

import java.util.*;
import java.util.List;

public class Ex_06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + products.get(i - 1));
        }
    }
}