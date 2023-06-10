package Accenture_1;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class A {
    private static final DecimalFormat decimal = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String movie = sc.next();

        double a = 0, b = 7.00, c = 12.00, d = 2.50;
        if (age >= 0 && age <= 5) {
            if (Objects.equals(movie, "regular")) {
                System.out.println(decimal.format(a));
            } else {
                System.out.println(decimal.format(a + d));
            }
        } else if (age >= 6 && age <= 17) {
            if (Objects.equals(movie, "regular")) {
                System.out.println(decimal.format(b + a));
            } else {
                System.out.println(decimal.format(b + d));
            }
        } else if (age >= 18) {
            if (Objects.equals(movie, "regular")) {
                System.out.println(decimal.format(c + a));
            } else {
                System.out.println(decimal.format(c + d));
            }
        }
    }
}
