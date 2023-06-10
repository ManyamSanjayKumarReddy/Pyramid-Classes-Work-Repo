package Accenture_1;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double avg = sc.nextDouble();

        String p1 = "Laptop";
        String p2 = "Smartwatch";
        String p3 = "Bluetooth Speaker";
        String p4 = "Headphones";
        String p5 = "No Prize";

        if (avg >= 90){
            System.out.println("A");
            System.out.println(p1);
        } else if (avg >= 80 && avg < 90) {
            System.out.println("B");
            System.out.println(p2);
        }
        else if (avg >= 70 && avg < 80) {
            System.out.println("C");
            System.out.println(p3);
        }
        else if (avg >= 60 && avg < 70) {
            System.out.println("D");
            System.out.println(p4);
        }
        else {
            System.out.println("F");
            System.out.println(p5);
        }
    }
}
