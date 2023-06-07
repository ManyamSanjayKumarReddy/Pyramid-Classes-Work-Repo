package Hash_set_and_Map;

import java.util.HashSet;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String str1;
        String str2;

        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();

        for (int z = 0; z < T; z++){
            str1 = sc.next();
            str2 = sc.next();

            for (int j = 0; j < str1.length(); j++){
                set1.add(str1.charAt(j));
            }

            for (int j = 0; j < str2.length(); j++){
                set2.add(str2.charAt(j));
            }

            if (set1.size() == set2.size()){
                if (set1.equals(set2)){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }
            else {
                System.out.println("False");
            }
        }
    }
}

