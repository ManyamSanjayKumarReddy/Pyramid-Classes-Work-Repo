package Strings;

import java.util.Scanner;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        char character = sc.next().charAt(0);


        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character) {
                count++;
            }
        }

        System.out.println(count);
    }
}
