package Day_4;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 0){
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Neutral");}
    }
}
