package Strings;

import java.util.Scanner;

public class H {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String compressed_string;

        int count = 0;
        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j < string.length(); j++){
                if (string.charAt(i) == string.charAt(j)){


                    count++;
                    System.out.print(string.charAt(i));
                    System.out.print(count);
                }
            }
        }

    }
}
