package Arrays;

import java.util.Scanner;

public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }


        for (int i = 0; i < N - 1; i++){
            for (int j = i+1; j < N; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }
    }
}
