package Day_4;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Company ID : ");
        int id = sc.nextInt();
        System.out.println("Enter the Name of the Company : ");
        String name = sc.next();
        System.out.println("Enter the Price of the Company : ");
        float price = sc.nextFloat();
        System.out.println("Enter the Quantity of the Company : ");
        int quant = sc.nextInt();
        System.out.println("Enter if the Company is Registered ");
        String register = sc.next();


        System.out.println("The Id of the Company is " + id +
                ". The name of the Company is " + name + ". The price of the product is "
        + price + ". The quantity of the product is " + quant + " and the company was " + register);

    }
}
