package Strings;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int z = 0; z < T; z++) {
            String str = sc.nextLine();
            String[] arr =str.split(" ");
            String str1=arr[0];
            String str2=arr[1];

            StringBuilder str3 = new StringBuilder();
            for (int i = 0; i < str2.length(); i++) {
                char a = str2.charAt(i);
                if(!str1.contains(String.valueOf(a))){
                    str3.append(str2.charAt(i));
                }
            }
            System.out.println(str3);
        }
    }
}
