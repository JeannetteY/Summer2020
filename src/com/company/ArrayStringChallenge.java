/*
Jeannette Yang
copy the StringsChallenge code over
change the all the userWords to myArray in the main
create a second array for the return from the method
    create a forloop with int j
    call the method
    and print
 */

package com.company;
import java.lang.reflect.Array;
import java.util.*;
public class ArrayStringChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T; //the number of words the user wants to process
        do {
            System.out.println("Type an integer for the number of words you want to do 1-10:");
            T = input.nextInt();
        } while (T > 10 || T < 2); //this keeps the letters between 2-10
        int i = 0;

        //changing the old userWord to myArray and adding a loop so it makes an array instead of a string
        String[] myArray = new String[T];
        System.out.println("Type your words");
        for (i = 0; i < T; i++) {
            do {
                myArray[i] = input.next();
            } while (myArray[i].length() <= 1 || myArray[i].length() > 1000);
        }

        //second array for calling and receiving the method
        String[] Array2 = new String[myArray.length];
        for (int j = 0; j<Array2.length; j++){
            Array2[j] = create(myArray[j]);
            System.out.println(Array2[j]);
        }

    }
    //This is all the same as the old code
    public static String create(String userWord){
        String wordEven = "";
        String wordOdd = "";

        for (int even = 0; even < userWord.length(); even += 2) {
            char evenLetter = userWord.charAt(even);
            wordEven = wordEven + evenLetter; // this adds the next even letter every time the loop runs
        }
        for(int odd = 1; odd < userWord.length() ; odd+=2) {
            //the odd=1 makes the letters odd because they go 1 3 5 etc
            char oddLetter = userWord.charAt(odd);
            wordOdd = wordOdd+oddLetter; // this adds the next odd letter every time the loop runs
        }
        String newWord = (wordEven+" "+ wordOdd);
        return newWord; //returning the even and odd letters to the main
    }
}


