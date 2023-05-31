package Day_3.Scenes;

import java.util.Scanner;

public class Scene_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total Number of Gold Coins : ");
        float coins = sc.nextFloat();
        System.out.print("Percentage share of Long Ben's : ");
        float share1 = sc.nextFloat();
        System.out.print("Percentage share of Black Beard : ");
        float share2 = sc.nextFloat();

        float person1_share = coins * share1 / 100;
        float person2_share = (coins - person1_share) * share2 / 100;

        float remaining_share = (coins - person1_share) * (100 - share2) / 100;

        System.out.println(person1_share);
        System.out.println(person2_share);
        System.out.println(remaining_share / 3);
    }
}
