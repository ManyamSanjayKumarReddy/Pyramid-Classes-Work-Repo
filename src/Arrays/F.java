package Arrays;

import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        int S = sc.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++){
            if (arr[i] == S){
                System.out.println(i);
            }
            else {
                System.out.println(-1);
            }
            break;
        }

    }
}
