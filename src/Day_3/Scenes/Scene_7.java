package Day_3.Scenes;

import java.util.Scanner;

/*
    birth year - last 2 digits
    current year - last 2 digits

    99 - 23

    23 - 99
 */
public class Scene_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Last 2 Digits of the Birth Year : ");
        int brith = sc.nextInt();
        System.out.print("Enter the Last 2 Digits of the Current Year : ");
        int current = sc.nextInt();

        int value = current - brith;

        if (value >= 0){
            System.out.println("Age is " + value);
        }
        else {
            System.out.println("Age is " + (100 + value));
        }


    }
}
