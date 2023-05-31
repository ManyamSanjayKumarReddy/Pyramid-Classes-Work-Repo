package Day_3.Scenes;

import java.util.Scanner;

/*
    2 items - add 50% heating time
    3 items - double the heating time
    if items are > 3 not recommended

 */
public class Scene_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of items : ");
        int items = sc.nextInt();
        System.out.print("Enter the Heating Time : ");
        int heating_time = sc.nextInt();

        if (items <= 3) {
            if (items == 2) {
                float time = (float) (heating_time + heating_time * 0.5);
                System.out.println("Heating Time is " + time);
            } else if (items == 3) {
                float time = (float) (heating_time * 2);
                System.out.println("Heating Time is " + time);
            }
        } else {
            System.out.println("Number of items are more ...");
        }
    }
}
