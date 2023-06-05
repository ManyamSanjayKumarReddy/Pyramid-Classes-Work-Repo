package Strings;

import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String l = sc.next();

        // print the odd indices
        for (int i = 1; i < l.length(); i = i + 2){
            System.out.print(l.charAt(i));
        }

        // print the even indices
        for (int i = 0; i < l.length(); i = i + 2){
            System.out.print(l.charAt(i));
        }
    }
}
