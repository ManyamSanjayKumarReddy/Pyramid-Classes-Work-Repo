package Day_3;

import java.util.Objects;
import java.util.Scanner;

public class Circuit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the User Name : ");
        String user = sc.next();
        System.out.print("Enter the Status : ");
        int status = sc.nextInt();
        if (Objects.equals(status, 0)){
            System.out.println("Dear " + user+ " Circuit Status is OFF.");
        } else if (Objects.equals(status, 1)) {
            System.out.println("Dear " + user + " Circuit Status is ON.");
        }
        else {
            System.out.println("Code Entered is Incorrect.");
        }
    }
}
