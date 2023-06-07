package Day_8.Hashset;

import java.util.HashSet;
import java.util.Scanner;
/*
    Another Approach is that we can directly compare the rams truth and dares
    rather than comparing with taking extra 2 hashsets.
 */
public class O {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- != 0){
            int rt = sc.nextInt();
            HashSet<Integer> set_rt = new HashSet<>();
            for (int i =0; i < rt; i++){
                int a = sc.nextInt();
                set_rt.add(a);
            }

            int rd = sc.nextInt();
            HashSet<Integer> set_rd = new HashSet<>();
            for (int i =0; i < rd; i++){
                int b = sc.nextInt();
                set_rd.add(b);
            }

            int st = sc.nextInt();
            HashSet<Integer> set_st = new HashSet<>();
            for (int i =0; i < st; i++){
                int c = sc.nextInt();
                set_st.add(c);
            }

            int sd = sc.nextInt();
            HashSet<Integer> set_sd = new HashSet<>();
            for (int i =0; i < sd; i++){
                int d = sc.nextInt();
                set_sd.add(d);
            }

            int flag = 0;
            for (Integer b : set_st){
                if (!set_rt.contains(b)){
                    flag = 1;
                    break;
                }
            }

            int flag1 = 0;
            for (Integer c : set_sd){
                if (!set_rd.contains(c)){
                    flag1 = 1;
                    break;
                }
            }

            if(flag==0 && flag1==0){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
