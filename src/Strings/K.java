package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class K {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while (T > 0){
            String sentence = sc.nextLine();
            String[] words = splitSentenceIntoWords(sentence);
            int wordcount = words.length;
            int vowelcount = 0;
            int consonantcount = 0;

            for (String word : words){
                for (char c : word.toCharArray()){
                    if (Character.isLetter(c)){
                        char lowercase = Character.toLowerCase(c);
                        if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u'){
                            vowelcount++;
                        }
                        else {
                            consonantcount++;
                        }
                    }
                }
            }

            System.out.println(wordcount + " " + vowelcount + " " + consonantcount);
            T--;

        }
    }


    // Creating a new function because it is considering white space is also an word
    public static String[] splitSentenceIntoWords(String sentence) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(sentence);
        String wordsString = "";

        while (matcher.find()) {
            wordsString += matcher.group() + " ";
        }

        return wordsString.trim().split("\\s+");
    }
}
