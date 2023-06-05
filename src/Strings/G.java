package Strings;

import java.util.Scanner;

public class G {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        char[] stringArray = string.toCharArray();

        for (int i = 0; i < stringArray.length; i++){
            char ch = stringArray[i];

            if (Character.isUpperCase(ch)){
                stringArray[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                stringArray[i] = Character.toUpperCase(ch);
            }
        }

        System.out.println(stringArray);
    }
}
