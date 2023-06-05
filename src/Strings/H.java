package Strings;

import java.util.Scanner;
/*
aaaBBB -- a3B3
 */
public class H {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        int count = 0;
        int i;
        for (i = 0; i < string.length() - 1; i++){
                if (string.charAt(i) == string.charAt(i+1)){
                    count = count + 1;
                }

                if (string.charAt(i) != string.charAt(i + 1)){
                    System.out.print(string.charAt(i));
                    System.out.print(count + 1);
                    count = 0;
                }
        }

        System.out.print(string.charAt(i));
        System.out.print(count + 1);
    }
}
