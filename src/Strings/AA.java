package Strings;

import java.util.Scanner;

public class AA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t > 0) {
            String s = sc.nextLine();
            String result = checkStringEquality(s);
            System.out.println(result);
            t--;
        }
    }

    public static String checkStringEquality(String s) {
        if (s.equalsIgnoreCase("YES")) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
