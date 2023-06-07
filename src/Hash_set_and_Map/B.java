package Hash_set_and_Map;

import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){

            HashSet<Character> set = new HashSet<Character>();
            String str = sc.next();

            for (int j = 0; j < str.length(); j++){
                for (int k = j + 1; k < str.length(); k++){
                    char ch = str.charAt(k);
                    set.add(ch);
                    if (set.contains(ch)){
                        System.out.println(ch);
                        break;
                    }
                    else {
                        System.out.println('.');
                        break;
                    }
                }
            }
        }
    }
}
