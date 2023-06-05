package Strings;

import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int z = 0; z < T; z++) {
            String S = sc.nextLine();
            int flag = 0;

            for (int i = 0; i < S.length(); i++) {
                for (int j = i + 1; j < S.length(); j++) {
                    if (S.charAt(i) == S.charAt(j)) {
                        flag = 1;
                        System.out.println(S.charAt(i));
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(".");
            }
        }
    }
}