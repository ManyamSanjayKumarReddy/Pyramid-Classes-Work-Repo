package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Reversing an Array -- Using Recursion
 */
public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++){
            arr[i] = sc.nextLong();
        }

        int start = 0;
        int end = N - 1;

        while (start < end){
            // Swapping the Integers with start and end

            int temp = (int) arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the indices towards center
            start++;
            end--;
        }

        for (long J : arr){
            System.out.print(J + " ");
        }

    }

}