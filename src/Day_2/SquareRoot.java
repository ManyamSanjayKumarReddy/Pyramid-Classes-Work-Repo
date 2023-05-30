package Day_2;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the  : ");
        int n = sc.nextInt();

        double square = Math.sqrt(n);
        System.out.println("The Square Root of " + n + " is "+ square);
    }
}
