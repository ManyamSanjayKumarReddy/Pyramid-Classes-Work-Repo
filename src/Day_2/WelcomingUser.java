package Day_2;

import java.util.Scanner;

public class WelcomingUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String user = sc.next();

        System.out.println("Hey!! " + user + ", Welcome to the Technical Training Program.");
    }
}
