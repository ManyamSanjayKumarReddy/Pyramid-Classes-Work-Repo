package Day_2;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to get Random Numbers : ");
        int range = sc.nextInt();

        Random rand = new Random();
        int random = rand.nextInt(range);
        System.out.println("Randomly Generated Value in the range of " + range + " is " + random);
    }
}
