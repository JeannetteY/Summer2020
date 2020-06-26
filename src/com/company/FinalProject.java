/*
put at least 20 lines and 20 tokens of int, word, doubles to the file
import util.*
import java.io.File;
import java.io.FileNotFoundException;
create Scanner input
create Scanner userInput for non file related input

main Method
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

integer Method
Print line "guess something a number between 1 and 500"
copy the code from the Word method
change the println to work for number game
change strings to Int
add consume trash string

double Method
Print line "guess something a number between 1 and 500"
copy the code from the Word method
change the println to work for number game
change strings to double
add consume trash string

Welcome method
this is just a void method to fulfill the requirements
make println to welcome the user to the game
 */

package com.company;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class FinalProject {
    public static int count = 0;//the number of times the player plays
    public static void main(String[] args) throws FileNotFoundException {
        String answer;
        int score = 0;//number of times the player wins
        String reply;
        Scanner userInput = new Scanner(System.in); //create Scanner userInput for non file related input

        welcome(userInput);//welcome screen void method

        do {
            File file = new File("C:\\Users\\jeann\\IdeaProjects\\ComputerScience2020\\src\\com\\company\\word game");
            Scanner input = new Scanner(file);//file reading scanner
            System.out.println("Would you like to play a word, integer, or double game?");
            reply = userInput.next();
            if (reply.equals("word")) {
                count++;//adds everytime the player plays
                score = Word(input, userInput, score);
            } else if (reply.equals("integer")){
                count++;
                score = integer(input, userInput, score);
            }else if (reply.equals("double")) {
                count++;
                score = Double(input, userInput, score);
            }
            System.out.println("Would you like to guess again?");
            answer = userInput.next();
            input.close();
        } while (answer.contains("y"));//if the users answer contains y then the whole game runs again

        System.out.println("Your score is: " + score+" out of "+ count); //number of wins and games played println
    }

    public static int Word(Scanner input, Scanner userInput, int score) {
        boolean flag = true;//only when the flag is false can the program say you got the wrong answer
        System.out.println("Guess a word for something you would find in your home");
        String answerWord = userInput.next();
        while (input.hasNextLine()) {
            if (input.next().equals(answerWord)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }

        //this decides if the answer is right or not based on the flag
        if (!flag) {
            System.out.println("You did not guess correctly");
        }else if (flag){
            score++;
            System.out.println("Congrats you guessed a correct word!");
        }

        return score;//returns to the main
    }

    public static int integer(Scanner input, Scanner userInput, int score) { //the method for the integers game
        boolean flag = true;
        System.out.println("You have chosen the Integers game! Guess a integer between 0 and 500 and see if you get it right");
        int answerInt = userInput.nextInt();
        while (input.hasNextLine()) {
            if (input.hasNextInt()) {
                if (input.nextInt() == (answerInt)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            } else {
                String trash = input.next();
            }
        }

        //this decides if the answer is right or not based on the flag
        if (!flag) {
            System.out.println("You did not guess correctly");
        }else if (flag){
            score++;
            System.out.println("Congrats you guessed a correct number!");
        }

        return score;
    }

    public static int Double(Scanner input, Scanner userInput, int score) { //the method for the doubles game
        boolean flag = true;
        System.out.println("You have chosen the double game! Guess a double between 0 and 10 and see if you get it right");
        double answerDouble = userInput.nextDouble();
        while (input.hasNextLine()) {
            if (input.hasNextDouble()) {
                if (input.nextDouble() == (answerDouble)) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            } else {
                String trash = input.next();
            }
        }

        //this decides if the answer is right or not based on the flag
        if (!flag) {
            System.out.println("You did not guess correctly");
        }else if (flag){
            score++;
            System.out.println("Congrats you guessed a correct number!");
        }

        return score;
    }

    public static void welcome(Scanner userInput){
        System.out.println("Welcome the Guessing Game!");
        System.out.println("");
        System.out.println("      ????????????      ");
        System.out.println("    ????????????????    ");
        System.out.println("  ???????      ???????  ");
        System.out.println("  ??????        ??????? ");
        System.out.println("               ???????? ");
        System.out.println("              ????????  ");
        System.out.println("            ????????    ");
        System.out.println("          ????????      ");
        System.out.println("         ???????        ");
        System.out.println("         ???????        ");
        System.out.println("");
        System.out.println("         ?????          ");
        System.out.println("        ???????         ");
        System.out.println("         ?????          ");
        System.out.println("");
        System.out.println("Type start to begin");
        String start = userInput.next();
    }
}
