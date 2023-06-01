package Java_Codes;

import java.util.Scanner;

public class BT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int A,B,C ;
        double Avg;

        for (int i = 0; i < T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();

            Avg = (A+B)/2.0;

            if(Avg > C)
                System.out.println("YES");

            else
                System.out.println("NO");

        }

    }
}

