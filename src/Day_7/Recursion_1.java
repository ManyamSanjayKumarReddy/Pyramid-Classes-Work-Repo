package Day_7;

import java.util.*;

/*
    Computing X^n --
        for n = 0 --> 1
        for n = 1 --> X
        for Even --> X^n = power(x*x , n/2)
        for Odd --> X^n = power(x, n-1)
 */
public class Recursion_1 {

    static int count = 0;

    static int power(int x, int n){
        if (n == 0){
            return 1;
        } else if (n == 1) {
            return x;
        } else if (n % 2 == 0) {
            count++;
            //System.out.println("Even is Called");
            return power(x*x, n/2);
        }
        else {
            count++;
            //System.out.println("Odd is Called");
            return x * power(x, n-1);
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.println(power(num, pow));
        System.out.println(count + " times Multiplication is done." );

    }
}
