package Strings;

import java.util.Scanner;

/*
        Notes :

        -- Java is an Object-Oriented Programming Language - Contains Classes, Objects.
        -- Class is Just a blueprint.
        -- Objects are known as the Physical Things of the Classes.
        -- We have to write class in any program for the security of the code.
        -- Main is the keyword which we people designed to run in any of the online Compiler.
        -- And also Public is also required
        -- Now we have to receive the input.
        --
 */

public class A{
    public static void main(String[] marker){
        Scanner bramhanandam = new Scanner(System.in);
        String S = bramhanandam.nextLine();
        for (int car = S.length() - 1; car >= 0; car--){
            System.out.print(S.charAt(car));
        }
    }
}