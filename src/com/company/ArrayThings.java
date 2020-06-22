package com.company;
import java.util.*;
public class ArrayThings {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int[] fixArray = new int[10];
        Arrays.fill(fixArray,4);
        Random randy = new Random();
        double [] doubleArray = new double[15];
        String[] sArray = {"maria"," Peter", "Megan", "Jeannette"};
        boolean flag = false;
        int index = 0;
        for (index = 0; index < myArray.length; index++) {
            myArray[index] = randy.nextInt(10) +1;//modifying the values of the array
            System.out.println("This is the value in index "+ index+" " +myArray[index]);//accessing the values of the array
//            System.out.println("This is the value in index "+ index+" " +fixArray[index]);
        if(myArray[index]==4){
            flag =!flag;
            break;
        }
        }
        if (flag){
            System.out.println("we have a 4 at index: " + index);
        }
        Arrays.sort(myArray);
        for ( index = 0; index < myArray.length; index++) {
            myArray[index] = randy.nextInt(10) + 1;//modifying the values of the array
            System.out.println("This is the value in index " + index + " " + myArray[index]);//accessing the values of the array
        }

//        for (int index = 0; index < doubleArray.length; index++) {
//            doubleArray[index] = randy.nextDouble()*10;
//            System.out.println("This is the value in index "+ index+" " +doubleArray[index]);
        }
//        System.out.println("The name in index "+(sArray.length-1)+"is "+ sArray[sArray.length-1]);
    }
//    }