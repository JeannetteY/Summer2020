/*
Jeannette Yang
Pseudocode
import *
create scanner
make n random
    n>=1 n<=137
Make conditional statements
    - If n is odd, print Weird
    - If n is even and in the inclusive range of 2 to 5, print Not Weird
    - If n is even and in the inclusive range of 6 to20, print Weird
    - If n is even and greater than 20, print Not Weird
print the statement that is true to the value of n
ask the user if they want to go again
 */
package com.company;
import java.util.*;
public class ConditionalStatements {
    public static void main(String[]args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        String answer;
        do {
            n = ran.nextInt(137) + 1;
            System.out.println(n);
            categories(n); //calling the method

            //this makes the program run after the user allows it
            System.out.println("Do you wish to continue?");
            answer = input.nextLine();
        } while (answer.contains("y"));
    }
    public static void categories (int n){

        //conditional statement for sorting the random number
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
    }
}
