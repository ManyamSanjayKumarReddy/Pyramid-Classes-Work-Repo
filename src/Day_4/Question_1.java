package Day_4;
/*
 Wiki is a Automated Robot which is playing with Numbers.
    It wants to identify Negative Numbers, +ve and Neutral. Write a Java Program for this Case.
 */
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
