package Strings;

import java.util.Scanner;

/*
        Reverse a string
 */
public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        System.out.println(reversedString(l));
    }

    static String reversedString(String str){
        char[] stringArray = str.toCharArray();
        int start = 0;
        int end = stringArray.length - 1;

        while (start < end){
            char temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;

            start++;
            end--;
        }

        return new String(stringArray);
    }
}
