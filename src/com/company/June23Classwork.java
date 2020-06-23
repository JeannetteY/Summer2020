/*
import util.*
create new Random variable
create a random size for the array
    between 5 and 10
    create  for loop to make a random number for each index of the array
define 2 variables for making random indexes
    index1 and index2
    make a do while loop to make sure that index1 and 2 are not equal
Make a print line for the array
call the method
make another print line to print the returned array
    create the swap method
    substitute all the new variables into existing code
    make a return to the main

 */
package com.company;
import java.util.*;
public class June23Classwork {
    public static void main(String[]args){
    Random rand = new Random();
    int size= rand.nextInt(5)+5;//this keeps the array length between 5-10
    int[]numbers =new int [size];

        //create  for loop to make a random number for each index of the array
        for(int i=0; i<size; i++) {
            numbers[i] = rand.nextInt();
        }

        //define 2 variables for making random indexes
        int index1;
        int index2;

        //make a do while loop to make sure that index1 and 2 are not equal
        do{
            index1 = rand.nextInt(size);//the size makes sure that the number stays in range
            index2 = rand.nextInt(size);
        }while (index1 == index2);//this makes sure that he indexes aren't equal to each other

        System.out.println(Arrays.toString(numbers));
    numbers = swap(numbers, index1,index2); //call the method
        System.out.println(Arrays.toString(numbers));//prints returned array
    }

    public static int[] swap(int[] numbers, int index1,int index2){

            //this swaps the numbers at the random indexes
            int temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2]=temp;

        return numbers;//return to the main
    }
}
