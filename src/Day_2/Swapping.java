/*

We Can do swapping with 3 conditions like

addition and sub
mul and div
XOR

 */

package Day_2;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number 1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter the Number 2 : ");
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("The Swapped Numbers are (" + num1 + ", "+ num2+ ")");
    }

}

