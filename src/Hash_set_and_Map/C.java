package Hash_set_and_Map;


import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        for (int z = 0; z < T; z++){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if (str1.length() == str2.length()){
                char[] arr = str1.toCharArray();
                char[] arr1 = str2.toCharArray();

                Arrays.sort(arr);
                Arrays.sort(arr1);

                if (Arrays.equals(arr, arr1)){
                    System.out.println("True");
                }
                else {
                    System.out.println("False");
                }
            }

            if (str1.length() != str2.length()){
                System.out.println("False");
            }
        }
    }

}

