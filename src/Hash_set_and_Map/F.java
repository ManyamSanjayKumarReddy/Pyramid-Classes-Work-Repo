package Hash_set_and_Map;

import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.next();
        }
        ArrayList<String> list = new ArrayList<String>();
        for (String k:arr){
            if(!list.contains(k)){
                list.add(k);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<String> arr2 = new ArrayList<String>();
        for (String k:list) {
            int count=0;
            for (String l:arr) {
                if(k.equals(l)){
                    count++;
                }
            }
            arr1.add(count);
            arr2.add(k);
        }
        int max=0;
        for(Integer x:arr1){
            if(x>max){
                max=x;
            }
        }
        int index=arr1.indexOf(max);
        System.out.println(arr2.get(index)+" "+max);
    }
}
