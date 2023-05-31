package Day_3.Scenes;

import java.util.*;

/*

Sum of the Digits of the 2 Digit Number in the Tree.

 */
public class Scene_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 2 digit number that was displayed in the Tree : ");
        int n = sc.nextInt();

        List<Integer> digitlist = new ArrayList<>();
        collectDigits(n , digitlist);
        Object[] resultArr = digitlist.toArray();

        List<Object> resultList = Arrays.asList(resultArr);

        int digit1 = (int) resultList.get(0);
        int digit2 = (int) resultList.get(1);

        int sum = digit1 + digit2;
        System.out.println("The Sum of the Digits of the Given 2 Digit Number is : " + sum);
    }

    public static void collectDigits(int num, List<Integer> digits){
        if (num / 10 > 0){
            collectDigits(num / 10, digits );
        }
        digits.add(num % 10);
    }
}

/*

8 /10

 */