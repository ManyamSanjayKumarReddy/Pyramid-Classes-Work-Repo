package Strings;

import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine().toLowerCase();

        int vowel_count = 0;
        int consonant_count = 0;

        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || (string.charAt(i) == 'i' || string.charAt(i) == 'u')){
                vowel_count++;
            }
            else {
                consonant_count++;
            }

        }

        System.out.println(vowel_count + " " + consonant_count);


    }

}
