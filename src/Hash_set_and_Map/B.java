package Hash_set_and_Map;

import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int flag = 0;
            String s = sc.next();

            HashMap<Character, Integer> hm = new HashMap<>();
            char[] ch = s.toCharArray();

            // Calculating the Frequency
            for (char k : ch){
                if (hm.containsKey(k)){
                    hm.put(k, hm.get(k) + 1);
                }
                else {
                    hm.put(k, 1);
                }
            }

            for (int i = 0; i < s.length(); i++){
                if (hm.get(s.charAt(i)) > 1){
                    System.out.println(s.charAt(i));
                    flag = 1;
                    break;
                }
            }

            if (flag == 1);
            else {
                System.out.println('.');
            }
        }
    }
}
