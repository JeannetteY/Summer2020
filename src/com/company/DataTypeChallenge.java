/*
        Jeannette Yang's pseudocode and code
        6/16/2020
        Create Scanner
        Declare variables
        int i = 4;
        double d = 4.0;
        String s = "Greenhill”;
        Create input scanner
        Scanner input = new Scanner(System.in);
        Ask user to type
        A int
        A double
        Fill in the rest of the sentence “Greenhill”:
        Do this by making println for the output
        Create variable for each input
        i2
        d2
        s2
        Add the sums of input and variables together
        Create a variable that is the sum of each variable
        iSum
        dSum
        sSum
        System.out.printf(iSum \n dSum \n sSum);

 */
package com.company;

import java.util.*;
public class DataTypeChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";
        System.out.println("Please type an integer");
        int i2 = input.nextInt();
        System.out.println("Please type an double");
        double d2 = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Fill in the rest of the sentence Greenhill:");
        String s2 = input.nextLine();
        int iSum = (i + i2);
        double dSum = (d + d2);
        String sSum = s + s2;
        System.out.printf("Your integer sum is %d \nYour double sum is %.1f \nYour sentence is %s",iSum,dSum,sSum);

    }
}
