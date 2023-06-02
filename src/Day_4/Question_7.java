package Day_4;

import java.util.Objects;
import java.util.Scanner;

/*
    Jack and Jill are playing an alphabet game. Jack is interested in finding Vowels, While Jill is
        Interested in tracing consonants. Help the them with java Code
 */
public class Question_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Test Cases : ");
        int T = sc.nextInt();
        String alpha;
        for (int i = 0; i<=T; i++){
            alpha = sc.next().toLowerCase();
            switch (alpha) {
                case "a", "e", "i", "o", "u" -> System.out.println("Jack says its is Vowel.");
                default -> System.out.println("Jill Says it is Consonant.");
            }

            /*

            If else Case :
                if (alpha == "a" || alpha == "e" || alpha == "i" || alpha == "o" || alpha == "u"){
                    System.out.println("Jack says its is Vowel.");
                }
                else {
                    System.out.println("Jill Says its a Consonant");
                }

             */
        }
    }
}
