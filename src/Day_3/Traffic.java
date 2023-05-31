package Day_3;

import java.util.Scanner;

public class Traffic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Color of the Signal : ");
        String colour = sc.next();

        colour = colour.toLowerCase();

        switch (colour) {
            case "red" -> System.out.println("Wait for Some time it's Red Signal.... You are Not Allowed to Cross the Road");
            case "yellow" -> System.out.println("Hey!! your are requested to get ready for the Move....");
            case "green" -> System.out.println("Hurray!!! You are Ready to Go for the Ride........");
        }


    }
}
