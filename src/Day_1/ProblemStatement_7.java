package Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemStatement_7 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your ISBN Code for Verfication : ");
        int isbn = sc.nextInt();

        List<Integer> digitList = new ArrayList<>();
        collectDigits(isbn, digitList);
        Object[] resultArr = digitList.toArray();

        List<Object> resultlist = Arrays.asList(resultArr);

        int count = resultArr.length;

        if (count != 10){
            System.out.println("ILLEGAL ISBN CODE");
        }
        if (count == 10){

            int digit1 = (int) resultlist.get(0);
            int digit2 = (int) resultlist.get(1);
            int digit3 = (int) resultlist.get(2);
            int digit4 = (int) resultlist.get(3);
            int digit5 = (int) resultlist.get(4);
            int digit6 = (int) resultlist.get(5);
            int digit7 = (int) resultlist.get(6);
            int digit8 = (int) resultlist.get(7);
            int digit9 = (int) resultlist.get(8);
            int digit10 = (int) resultlist.get(9);

            int sum = digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4 + digit5 * 5
                    + digit6 * 6 + digit7 * 7 + digit8 * 8 + digit9 * 9 + digit10 * 10;


            if (sum % 11 == 0){
                System.out.println("LEGAL ISBN CODE ");
            }
            else {
                System.out.println("ILLEGAL ISBN CODE");
            }
        }

    }

    public static void collectDigits(int num, List<Integer> digits){
        if (num / 10 > 0){
            collectDigits(num / 10 , digits);
        }
        digits.add(num % 10);
    }
}
