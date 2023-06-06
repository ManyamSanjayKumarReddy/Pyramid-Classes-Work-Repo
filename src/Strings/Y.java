package Strings;

import java.util.Scanner;

public class Y {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int z = 0; z < t; z++){

            String string = sc.nextLine();
            String[] arr = string.split(" ");
            String str1 = arr[0];
            String str2 = arr[1];

            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();

            if (rank(str1) > rank(str2)) {
                System.out.println(">");
            }
            else if(rank(str1)<rank(str2)){
                System.out.println("<");
            }
            else {
                System.out.println("=");
            }
        }

    }

    static int count(String X){
        int count = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'X') {
                count++;
            }
        }
        return count;
    }

    static int rank(String X){
        int rank = 0;
        if (X.equals("S")){
            rank = -1;
        }

        if (X.endsWith("S")){
            rank = count(X)* -1;
            rank = rank -1;
        }

        if (X.equals("M")){
            rank = 1;
        }

        if (X.equals("L")){
            rank = 2;
        }

        if (X.endsWith("L")){
            rank = count(X) * 10;
            rank = rank + 2;
        }

        return rank;
    }
}
