package Java_Codes;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A + B > C){
            System.out.println("Yes");
        }
        else if (B + C > A) {
            System.out.println("Yes");

        }
        else if (C + A > A){
            System.out.println("Yes");
        }
    else {
            System.out.println("No");}
    }
}
