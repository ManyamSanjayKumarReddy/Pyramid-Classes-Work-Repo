package Day_10;

import java.util.Scanner;

public class Bubble_Sort {
    static int[] bubble_sort(int arr[], int n){
        int temp;
        boolean status = false;
        for (int i = 0; i < n; i++){
            for (int j = i +1; j < n - 1 - i; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    status = true;
                }
            }
            if (status != true){
                break;
            }

        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        arr = bubble_sort(arr , n);
        for (int i =0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
