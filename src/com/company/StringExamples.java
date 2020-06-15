package com.company;
import java.util.Scanner;
public class StringExamples {
    public static Scanner Console = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Type a phrase: ");
        String MySentence = Console.nextLine();
        Search(MySentence);
    }

    public static void Search(String MySentence) {
        int end = MySentence.indexOf(" ");
        char letter = ' ';
        String firstWord = MySentence.substring(0, end + 1);
        int count = 0;
        for (int i = 0; i < firstWord.length(); i++) {

            letter = firstWord.charAt(i);
            if (letter != ' ') {
                count++;
                String temp = MySentence.substring(i + 1);
                int indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                firstWord = firstWord.replace(letter, ' ');
                System.out.println(letter + " = " + count);
                count = 0;
            }
        }
    }
}



