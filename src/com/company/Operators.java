/*
Jeannette Yang
Pseudocode
import scanner
create scanner
Ask the user to type a
    - mealCost
    - tipPercent
    - taxPercent
create double tip = (tipPercent/100) *mealCost
create double tax = (taxPercent/100) *mealCost
add tip,tax,and mealCost together, call it totalCost
round to the nearest int
print the rounded integer
 */
package com.company;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //asking the user for inputs
    System.out.println("How much does your meal cost? ");
    double mealCost = input.nextDouble();
    System.out.println("What is the tip percent? ");
    int tipPercent = input.nextInt();
    System.out.println("What is the tax percent? ");
    int taxPercent = input.nextInt();

        //calculations of percentages
        double tip = ((double)tipPercent/(double)100) *mealCost;
        double tax = ((double)taxPercent/(double)100) *mealCost;
        double totalCost = (mealCost + tip + tax);

        //Final print with the rounding in the line
        System.out.println(Math.round(totalCost));
    }
}
