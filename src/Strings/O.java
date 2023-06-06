package Strings;

import java.util.HashSet;
import java.util.Scanner;

/*
    Pangram -- alphabet of this language appear in it at least once.
 */
public class O {
    public static void main(String[] car){
        Scanner sanju = new Scanner(System.in);
        int length = sanju.nextInt();
        String string = sanju.nextLine();

        if (string.length() != length){
            System.out.println("NO");
            return;
        }

        String str1 = string.toUpperCase();
        String str2 = string.replace(" ", "");

        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < str2.length(); i++){
            set.add(str2.charAt(i));

        }
        if (set.size() == 26){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
