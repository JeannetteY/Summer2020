package com.company;
import java.util.Scanner;
public class LetterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say something!");
        String phrase = sc.nextLine();
        int indexOf = phrase.indexOf(" ");
        String firstword = phrase.substring(0, indexOf + 1);// "Peter "
        char letter;
        int count = 0;
        for (int all = 0; all < firstword.length(); all++) {
            letter = firstword.charAt(all);
            if (letter != ' ') {
                count++;
                String temp = firstword.substring(all + 1);
                indexOf = temp.indexOf(letter);
                while (indexOf >= 0) {
                    count++;
                    //       System.out.println(temp + " " + indexOf);
                    temp = temp.substring(indexOf + 1);
                    indexOf = temp.indexOf(letter);
                }
                firstword = firstword.replace(letter, ' ');
                // you will go and check the rest of your message
                // you send phrase-firstWo
            }
        }
    }
}
