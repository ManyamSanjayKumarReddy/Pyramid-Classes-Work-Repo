package Hash_set_and_Map;


import java.util.HashSet;
import java.util.Scanner;

public class T{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.nextLong();
        }
        HashSet<Long> set = new HashSet<Long>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
