package Stack_Queues;

import java.util.Scanner;
import java.util.Stack;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Stack<String> stk = new Stack<>();
        for (int i =0; i< n; i++){
            String s = sc.nextLine();
            String[] arr1 = s.split(" ");
            for (int j = 0; j < arr1.length; j++){
                stk.add(arr1[j]);
            }

            while (stk.size() != 0){
                System.out.print(stk.pop() + " ");
            }
            System.out.println();
        }
    }
}
