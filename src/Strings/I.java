package Strings;

import java.util.Scanner;

public class I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String substring  = string.substring(0, string.length() - 1);
        int flag = 0;

        for (int i = string.length() - 1; i >= 0; i--){
            if (string.endsWith(substring)){
                flag = 1;
                System.out.println(substring.length());
                break;
            }
            else {
                substring = string.substring(0, i);
            }
        }
        if (flag == 0){
            System.out.println(0);
        }

    }
}
