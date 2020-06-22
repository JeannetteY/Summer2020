/*
Jeannette Yang
Pseudocode
Import util.*
Create Scanner
initialize strings with user input
    int T is the integer what user types for amount of words in the string
        2<=T>=10
        make a do while (T > 10 || T < 2)
    Make a for loop for the userWord using T to adjust the number of times the loop runs
        1<=userWord.length()<=1000
        code it using a do while (userWord.length() <= 1 || userWord.length() > 1000)
        make sure to do input.next() instead of input.nextLine
identify the string character indexes with charAt
   For loop for even and odd
    make the even/odd word + the letter = to the even/odd word
return the to the main method to print
    put it into the loop
 */

package com.company;
import java.util.*;
public class StringsChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T; //the number of words the user wants to process
        String userWord;
        do {
            System.out.println("Type an integer for the number of words you want to do 1-10:");
            T = input.nextInt();
        } while (T > 10 || T < 2); //this keeps the letters between 2-10

            for (int i = 0; i <= T; i++) { //This runs the whole program T amount of times
                do{
                    System.out.println("Type your words");
                userWord = input.next();
            }
            while (userWord.length() <= 1 || userWord.length() > 1000);
            //this is the constrains for what the length cannot be

                String newWord = create(userWord);//calls the method and receives the string from the method
                System.out.println(newWord);
            }
    }
    public static String create(String userWord){
        String wordEven = "";
        String wordOdd = "";

        for (int even = 0; even < userWord.length(); even += 2) {
            char evenLetter = userWord.charAt(even);
                wordEven = wordEven + evenLetter; // this adds the next even letter every time the loop runs
        }
        for(int odd = 1; odd <= userWord.length() ; odd+=2) {
            //the odd=1 makes the letters odd because they go 1 3 5 etc
            char oddLetter = userWord.charAt(odd);
            wordOdd = wordOdd+oddLetter; // this adds the next odd letter every time the loop runs
        }
        String newWord = (wordEven+" "+ wordOdd);
        return newWord; //returning the even and odd letters to the main
    }
}
