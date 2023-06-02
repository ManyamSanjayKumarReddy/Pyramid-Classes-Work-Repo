package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Maximum Element of the Array
 */
public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Getting the Size of the Array
        int N = sc.nextInt();
        // Creating the array with the size
        int[] arr = new int[N];

        // Getting the input from the User
        for (int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        /*
        // Using Stream API's to get Quick Answers
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
         */

        int max = findMaximum(arr);
        System.out.println(max);

    }

    public static int findMaximum(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
