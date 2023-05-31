package Day_3.Scenes;

import java.util.Scanner;

/*
 3 Persons --- Triangle
 find the person at what distance from the all the persons
 Centroid - (x1 + x2 + x3 / 3 , y1 + y2 + y3 / 3)
 */
public class Scene_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X Coordinate of Person 1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter the Y Coordinate of Person 1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter the X Coordinate of Person 2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter the Y Coordinate of Person 2 : ");
        int y2 = sc.nextInt();
        System.out.print("Enter the X Coordinate of Person 3 : ");
        int x3 = sc.nextInt();
        System.out.print("Enter the Y Coordinate of Person 3 : ");
        int y3 = sc.nextInt();

        float centroid_X = (float)  (x1 + x2 + x3) / 3;
        float centroid_Y = (float)  (y1 + y2 + y3) / 3;

        System.out.println(centroid_X);
        System.out.println(centroid_Y);
    }
}
