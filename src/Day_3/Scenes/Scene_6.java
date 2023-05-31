package Day_3.Scenes;

import java.util.Scanner;

/*
33km/1
 */
public class Scene_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Milage in km/litre : ");
        float milage = sc.nextFloat();
        System.out.print("Enter the Petrol in Liters : ");
        float petrol = sc.nextFloat();
        System.out.print("Enter the Distance to be Travelled in Kilometers : ");
        float distance = sc.nextFloat();

        float actual_distance = milage * petrol;
        if (distance <= actual_distance){
            System.out.println("He Can Reach the Destination");
        }
        else {
            System.out.println("He Cannot Reach the Destination.");
        }

    }
}
