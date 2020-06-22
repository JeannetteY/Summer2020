package com.company;
import java.util.Scanner;
public class PeerEdit {
//Josh Titens
//import Scanner
// print line that declares amount of strings to be used in code
//split the words up by every other letter
//repeat for every word
        public static void main(String[] args) {
            for (int i = 0; i < 10; i = i + 1) {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter a word: ");
                String phrase = input.nextLine();
                String evens = "";
                String odds = "";

                for (int n = 0; i < phrase.length(); i += 2) {
                    evens = evens + phrase.charAt(i);
                }
                for (int n = 1; i < phrase.length(); i += 2) {
                    odds = odds + phrase.charAt(i);
                }
                String answer = evens + " " + odds;
                System.out.print(answer);

            }

        }
    }
