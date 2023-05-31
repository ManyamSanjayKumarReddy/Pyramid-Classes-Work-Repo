package Day_3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RandomNUM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Timer to get the Random Number : ");
        int timer = sc.nextInt();
        Random rand = new Random();
        int random = rand.nextInt(timer);
        for (int i = 0; i< random+1; i++){
            if (Objects.equals(random, 5)){
                System.out.println("Beep!!.... Deliver the Product to the Costumer");
                break;
            }
        }
    }
}
