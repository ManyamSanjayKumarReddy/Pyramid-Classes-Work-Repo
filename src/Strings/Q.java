package Strings;

import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t ; z++) {
            String s = sc.next();
            String s1 ="codeforces";
            int count=0;
            if(s.length()==10){
                for (int i = 0; i < 10 ; i++) {
                    if(s.charAt(i) != s1.charAt(i)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
