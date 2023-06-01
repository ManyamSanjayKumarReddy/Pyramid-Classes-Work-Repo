package Java_Codes;

import java.util.Scanner;

public class Question_U {
    public static <or> void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (A > B){
            if (B > C){
                System.out.println(B);
            }
            if (C > B){
                System.out.println(C);
            }
        }
    }
}
