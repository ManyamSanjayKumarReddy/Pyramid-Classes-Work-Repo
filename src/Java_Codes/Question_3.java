package Java_Codes;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long length = sc.nextInt();
        long breadth = sc.nextInt();

        long area = length * breadth;
        System.out.println(area);
    }
}
