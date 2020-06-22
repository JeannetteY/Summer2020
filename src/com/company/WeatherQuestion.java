/*
Pseudocode
Jeannette Yang
create scanner
initialize variables days, randy, sum and count
Make a do while for the user input of days
    narrow down the possible inputs of days to 2-100
create an array with days amount of strings
make a for loop to generate a random number between 25 and 110 days times
calculate the average
make a counter for the number of days the temp is above the average
 */

package com.company;
import java.util.*;
public class WeatherQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days; //this is the number of days variable
        Random randy = new Random();
        double sum = 0.0;
        int count = 0;

        do {
            System.out.println("How many days' temperatures");
            days = input.nextInt();
        } while (days > 100 || days < 2); //putting a limit on the amount of days
        int[] myArray = new int[days]; //this creates an array with the value being days

        for (int i = 0; i < days; i++) {
            myArray[i] = randy.nextInt(85) + 25; // creates a random number between 25 and 110
            System.out.println("Day "+ (i+1) +" temperature " + myArray[i]);
            sum = sum + myArray[i];
        }
        double average = sum / days; //this calculates the average
        System.out.println("Average temp = " + average);

        for (int i = 0; i < days; i++) {
            if (myArray[i] > average) {
                count++; //every time a days temperature is greater than the average, the count adds 1
            }
        }
            System.out.println(count +" days are above the average temperature");
    }
}

