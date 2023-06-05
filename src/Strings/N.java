package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++){
            String str = sc.nextLine();
            String str1 = sc.nextLine();

            if (str.length() == str1.length()){
                char[] arr = str.toCharArray();
                char[] arr1 = str1.toCharArray();

                Arrays.sort(arr);
                Arrays.sort(arr1);

                if(Arrays.equals(arr, arr1)){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }

            if (str.length() != str1.length()){
                System.out.println("False");
            }
        }
    }
}

