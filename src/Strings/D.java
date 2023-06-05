package Strings;

import java.util.Scanner;

public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        boolean Vowels = checkVowels(S);

        if (checkVowels(S)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean checkVowels(String  str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                return false;
            }
        }
        return true;
    }
}
