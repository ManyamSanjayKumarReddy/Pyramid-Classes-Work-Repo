package Day_2;

import java.util.Scanner;

public class ArcLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        int radius = sc.nextInt();
        System.out.print("Enter the Center Angle in Radius : ");
        int angle = sc.nextInt();

        int arc_length = radius * angle;
        System.out.println("Arc Length of the Circle is : " + arc_length + " cms");
    }
}
