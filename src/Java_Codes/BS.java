package Java_Codes;

import java.util.Scanner;

public class BS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int X;
        int Time;

        for (int i = 0; i<T; i++){
            X = sc.nextInt();
            Time = (X * 60);
            System.out.println(Time / 30);
        }
    }
}
