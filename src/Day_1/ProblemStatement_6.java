package Day_1;

import java.util.Scanner;
public class ProblemStatement_6 {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the count of Bricks : ");
        int N = sc.nextInt();

        int i = 1;
        int total_bricks = 0;
        while (total_bricks < N){
            int a = i;  // Oswald's Bricks
            int b = i*2; // Henry's Bricks

            if (total_bricks + a >= N){
                System.out.println("Oswald");
                break;
            }

            if (total_bricks + a + b >= N){
                System.out.println("Henry");
                break;
            }

            total_bricks = total_bricks + a + b;
            i++;
        }
    }
}