package Day_3;

import java.util.Objects;
import java.util.Scanner;

public class Tossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the User Name : ");
        String user = sc.next();

        System.out.print("Enter the Outcome either H or T for Heads & Tails : ");
        String outcome = String.valueOf(sc.next().charAt(0));


        if (Objects.equals(outcome, "H")) {
            System.out.println(user + "'s outcome is Heads.");
        } else if (Objects.equals(outcome, "T")){
            System.out.println(user + "'s outcome is Tails.");
        }
        else {
            System.out.println("Wrong Input Please Check Again");
        }
    }}
