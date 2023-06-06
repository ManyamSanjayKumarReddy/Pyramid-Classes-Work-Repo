package Hash_set_and_Map;

import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sanju = new Scanner(System.in);
        String string = sanju.nextLine().toLowerCase();

        String str1 = string.replace(" ", "");
        HashSet<Character> set = new HashSet<Character>();

        for (int i =0; i < str1.length(); i++){
            set.add(str1.charAt(i));
        }

        if (set.size() == 26){
            System.out.println("pangram");
        }
        else {
            System.out.println("not pangram");
        }



    }
}
