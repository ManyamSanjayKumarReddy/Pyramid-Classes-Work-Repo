package Strings;

import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of words
        sc.nextLine(); // read the newline after n

        while (n > 0) {
            String word = sc.nextLine();
            String abbreviation = getAbbreviation(word);
            System.out.println(abbreviation);
            n--;
        }
    }

    public static String getAbbreviation(String word) {
        if (word.length() <= 10) {
            return word;
        } else {
            return word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
        }
    }
}
