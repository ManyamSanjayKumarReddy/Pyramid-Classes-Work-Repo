package Capgemini_1;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Books -- 5
    Electronics -- 12
    Clothing -- 8
 */
public class A {
    private static final DecimalFormat decimal = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        double amount = sc.nextDouble();

        switch (type) {
            case "books" -> System.out.println(decimal.format(amount + amount * 0.05));
            case "electronics" -> System.out.println(decimal.format(amount + amount * 0.12));
            case "clothing" -> System.out.println(decimal.format(amount + amount * 0.08));
        }
    }
}
