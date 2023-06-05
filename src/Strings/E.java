package Strings;

import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        boolean Digits = checkDigits(S);

        if (checkDigits(S)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static boolean checkDigits(String  str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch != '0' && ch != '1' && ch != '2' && ch != '3' && ch != '4' && ch != '5' && ch != '6' && ch != '7' && ch != '8' && ch != '9'){
                return false;
            }
        }
        return true;
    }
}
