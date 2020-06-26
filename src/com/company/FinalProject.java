/*
put at least 20 lines and 20 tokens of int, word, doubles to the file
import util.*
import java.io.File;
import java.io.FileNotFoundException;
create Scanner input
create Scanner userInput for non file related input
Make a do
Ask the user if they want to guess numbers or words
Create if
Call the word method
add to the count
else if
call the number method
add to the count
while if the user answers y
create two different methods one for numbers and one for words
print score and count

Word Method
Print line "guess something you would find in the kitchen"
get user input
make a while loop
    (input.hasNextLine())
search the file for input using if statement
    input.hasNextString
    then check the file if it contains input
    if it contains userInput then add to the score
    then and another if statement for if the word is wrong
return the score

Number Method
Print line "guess something a number between 1 and 500"
copy the code from the Word method
change the println to work for number game

 */

package com.company;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class FinalProject {
    public static int count = 0;
    public static void main(String[] args) throws FileNotFoundException {
        String answer = "";
        int score = 0;
        String reply;
        File file = new File("C:\\Users\\jeann\\IdeaProjects\\ComputerScience2020\\src\\com\\company\\word game");
        Scanner input = new Scanner(file);
        Scanner userInput = new Scanner(System.in); //create Scanner userInput for non file related input

        System.out.println("Welcome the Guessing Game!");

        do {
            System.out.println("Would you like to play a word or number game?");
            reply = userInput.next();
            if (reply.equals("word")) {
                count++;
                score = Word(input, userInput, score);

            } else if (reply.equals("number")){
                count++;
                score = Number(input, userInput, score);
            }
            System.out.println("Would you like to guess again?");
            answer = userInput.next();
        } while (answer.contains("y"));
        System.out.println("Your score is: " + score+" out of "+ count);
    }

    public static int Word(Scanner input, Scanner userInput, int score) {
        boolean flag = false;
        System.out.println("Guess a word for something you would find in your home");
        String answerWord = userInput.next();
        while (input.hasNextLine()) {
            if (input.next().contains(answerWord)) {
                flag = true;
                score++;
                System.out.println("Congrats you guessed a correct word!");
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("You did not guess correctly");
        }
        return score;
    }

    public static int Number(Scanner input, Scanner userInput, int score) {
        boolean flag = false;
        System.out.println("You have chosen the numbers game! Guess a number between 0 and 500 and see if you get it right");
        String answerWord = userInput.next();
        while (input.hasNextLine()) {
            if (input.next().contains(answerWord)) {
                flag = true;
                score++;
                System.out.println("Congrats you guessed the correct number!");
                break;
            } else {
                flag = false;
            }
        }
        if (flag == false) {
            System.out.println("You did not guess correctly");
        }
        return score;
    }
}
