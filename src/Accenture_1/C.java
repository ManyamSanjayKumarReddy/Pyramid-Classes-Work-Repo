package Accenture_1;

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = scanner.nextInt();
        scanner.nextLine();

        String bike = scanner.nextLine().toLowerCase();

        String features = scanner.nextLine().toLowerCase();

        if (bike.equals("mountain") && budget >= 500 && features.contains("off-road")) {
            System.out.println("Mountain Bike - 500");
        } else if (bike.equals("road") && budget >= 700 && features.contains("lightweight")) {
            System.out.println("Road Bike - 700");
        } else if (bike.equals("hybrid") && budget >= 600 && features.contains("multiple gears")) {
            System.out.println("Hybrid Bike - 600");
        } else {
            System.out.println("No suitable bicycles found.");
        }
    }
}