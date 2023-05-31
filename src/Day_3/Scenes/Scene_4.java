package Day_3.Scenes;

import java.util.Scanner;

/*
    Total days = 373
    Year - 365 days
    Weeks - 7 days
    Day - 1 day
 */
public class Scene_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Days : ");
        int days = sc.nextInt();

        int years =  days / 373;
        int weeks =  (days - 365) / 7;
        int reamin_days = days - (365 * years + weeks * 7);
        System.out.println("The Years are : " + years);
        System.out.println("The Weeks are : " + weeks);
        System.out.println("The Days are : " + reamin_days);

    }
}
