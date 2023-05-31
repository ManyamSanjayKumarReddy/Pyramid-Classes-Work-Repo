package Day_3.Scenes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
    Items - 2 Applicable for Discount
    Different Items has different discount Prices
    1. Check if she bought 2 items or not if not Cancel the Discount
    2. Check the Individual Discounted Prices for the 2 items
    3. Add them to get the Total Saved Amount
    4. Total Amount is the Addtion
    4. Total Amount - Total Amount Saved --> gives the Discounted Price

 */
public class Scene_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Price of the Item 1 : ");
        float price_1 = sc.nextFloat();
        System.out.print("Enter the Price of the Item 2 : ");
        float price_2 = sc.nextFloat();
        System.out.print("Enter the Amount of Discount : ");
        float discount = sc.nextFloat();

        float discounted_price1 = price_1 * discount / 100;
        float discounted_price2 = price_2 * discount / 100;

        float total_discounted_price = discounted_price1 + discounted_price2;

        float total_amount = price_1 + price_2;

        float discounted_price = total_amount - total_discounted_price;

        System.out.println("Total Amount : " + total_amount);
        System.out.println("Discounted price : " + discounted_price);
        System.out.println("Amount Saved : " + total_discounted_price);



    }
}
