package Stack_Queues;

import java.util.ArrayList;
import java.util.Scanner;

public class F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0; i < n; i++){
            String s = sc.nextLine();
            if (s.charAt(0) == 'E'){
                String[] arr1 = s.split(" ");
                int a = Integer.parseInt(arr1[1]);
                arr.add(a);
            }

            else {
                if (arr.size() == 0){
                    System.out.println("Empty");
                }
                else {
                    System.out.println(arr.remove(0));
                }
            }
        }
    }
}
