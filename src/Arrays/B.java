package Arrays;

import java.util.Scanner;

/*
    Reversing an Array -- Using Recursion
 */
public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        reverseArray(arr, N - 1);
    }

    public static long[] reverseArray(long[] arr, int index) {

        if (index < 0) {
            return null;
        }

        System.out.print(arr[index] + " ");
        reverseArray(arr, index - 1);

        return arr;
    }

}