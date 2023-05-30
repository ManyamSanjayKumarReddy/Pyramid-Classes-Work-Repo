package Day_2;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second NUmber : ");
        int num2 = sc.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        float div = (float) num1 / num2;
        int mul = num1 * num2;
        int mod = num1 % num2;

        System.out.println("Addition of " + num1 + " and "+ num2 + " is " + add);
        System.out.println("Difference of " + num1 + " and "+ num2 + " is " + sub);
        System.out.println("Multiplication of " + num1 + " and "+ num2 + " is " + mul);
        System.out.println("Division of " + num1 + " and "+ num2 + " is " + div);
        System.out.println("Modulus of " + num1 + " and "+ num2 + " is " + mod);
    }
}
