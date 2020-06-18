/*
        Jeannette Yang's pseudocode and code
        6/16/2020
        Create Scanner and printf import
        Create input scanner
        Scanner input = new Scanner(System.in);
        Declare variables
        int i = 4;
        double d = 4.0;
        String s = "Greenhill”;
        Ask user to type as a input
        - A int
        - A double
        - Fill in the rest of the sentence “Greenhill”:
        Do this by making println for the output
        Create variable for each input
        - i2
        - d2
        - s2
        Add the sums of input and variables together
        Create a variable that is the sum of each variable
        - iSum
        - dSum
        - sSum
        Print the sums with printf
            make it all one line of print using \n and %
 */
package com.company;
import java.util.*; //import for scanner and printf
public class DataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //constant pre-defined variables
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        //System prints a message and the user responds
        System.out.println("Please type an integer");
        int i2 = input.nextInt();
        System.out.println("Please type an double");
        double d2 = input.nextDouble();
        input = new Scanner(System.in);
        System.out.println("Fill in the rest of the sentence Greenhill:");
        String s2 = input.nextLine();

        //These are the sums of the constants and the inputs
        int iSum = i + i2;
        double dSum = d + d2;
        String sSum = s + s2;

        //printing the results all in one line
        System.out.printf("%d \n%.1f \n%s",iSum,dSum,sSum);
    }
}
