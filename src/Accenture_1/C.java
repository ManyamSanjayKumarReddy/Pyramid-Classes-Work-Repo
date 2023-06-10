package Accenture_1;

import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = scanner.nextInt();
        scanner.nextLine();

        String bike = scanner.nextLine().toLowerCase();

        String[] features = new String[3];
        for (int i = 0; i < 3; i++){
            features[i] = scanner.next();
        }

        String[] featureset = {"off-road tires", "suspension system", "multiple gears", "thin tires", "lightweight frame", "versatile"};

        ArrayList<String> list = new ArrayList<>();

        list.add("off-road");
        list.add("suspension system");
        list.add("multiple gears");
        list.add("thin tires");
        list.add("lightweight frame");
        list.add("versatile");


        if (bike.equals("mountain") && budget >= 500) {
            if (list.contains(features)){
                System.out.println("Mountain Bike - 500");
            }
        } else if (bike.equals("road") && budget >= 700) {

            if (list.contains(features)){
                System.out.println("Road Bike - 700");
            }
        } else if (bike.equals("hybrid") && budget >= 600) {

            if (list.contains(features)){
                System.out.println("Hybrid Bike - 600");
            }
        } else {
            System.out.println("No suitable bicycles found.");
        }
    }
}