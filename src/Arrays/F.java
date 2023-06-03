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

        int index = -1;
        for (int i = 0; i < N; i++){
            if (arr[i] == S){
                index = i;
                break;
            }
        }

        System.out.println(index);

    }
}
