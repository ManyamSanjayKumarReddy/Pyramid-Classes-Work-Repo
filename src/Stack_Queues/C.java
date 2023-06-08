package Stack_Queues;

import java.util.*;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int T = sc.nextInt();
        while (T-- != 0) {

            k = k + 1;
            System.out.println("Case " + k + ":");

            int n;
            Stack<Integer> maxStk = new Stack<>();
            n = sc.nextInt();
            while (n-- != 0){
                char cmd;
                cmd = sc.next().charAt(0);
                if (cmd == 'A') {
                    int x;
                    x = sc.nextInt();
                    if (maxStk.empty()) maxStk.push(x);
                    else {
                        if (maxStk.peek() < x){maxStk.push(x);}
                        else maxStk.push(maxStk.peek());
                    }
                } else if (cmd == 'R') {
                    if (!maxStk.empty()){
                        maxStk.pop();
                    }
                }
                else {
                    if (maxStk.empty()) {
                        System.out.println("Empty");
                    }
                    else System.out.println(maxStk.peek());
                }

            }
        }
    }

}
