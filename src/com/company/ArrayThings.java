package com.company;
import java.util.*;
public class ArrayThings {
    public static void main(String[] args) {
//        int[] myArray = new int[10];
//        int[] fixArray = new int[10];
//        Arrays.fill(fixArray,4);
//        Random randy = new Random();
//        double [] doubleArray = new double[15];
//        String[] sArray = {"maria"," Peter", "Megan", "Jeannette"};
//        boolean flag = false;
//        int index = 0;
//        for (index = 0; index < myArray.length; index++) {
//            myArray[index] = randy.nextInt(10) +1;//modifying the values of the array
//            System.out.println("This is the value in index "+ index+" " +myArray[index]);//accessing the values of the array
////            System.out.println("This is the value in index "+ index+" " +fixArray[index]);
//        if(myArray[index]==4){
//            flag =!flag;
//            break;
//        }
//        }
//        if (flag){
//            System.out.println("we have a 4 at index: " + index);
//        }
//        Arrays.sort(myArray);
//        for ( index = 0; index < myArray.length; index++) {
//            myArray[index] = randy.nextInt(10) + 1;//modifying the values of the array
//            System.out.println("This is the value in index " + index + " " + myArray[index]);//accessing the values of the array
//        }

//        for (int index = 0; index < doubleArray.length; index++) {
//            doubleArray[index] = randy.nextDouble()*10;
//            System.out.println("This is the value in index "+ index+" " +doubleArray[index]);
//        System.out.println("The name in index "+(sArray.length-1)+"is "+ sArray[sArray.length-1]);


        //New Day
        Random rand = new Random();
        int[]numbers = {2,6,9,314,7,9,3};
        int[]num2= new int[numbers.length];
        for(int i=0; i<numbers.length; i++){
            num2[i] = rand.nextInt(95)+5;
        }
        System.out.println(Arrays.toString(numbers));
        numbers = reverse(numbers);
        System.out.println(Arrays.toString(num2));
        num2 = reverse(num2);
        System.out.println(Arrays.toString(num2));

    }

    public static int[] reverse(int[]rev){
        for (int i = 0 ; i<rev.length/2; i++){
            int temp = rev[i];
            rev[i] = rev[rev.length-1-i];
                rev[rev.length-1-i]=temp;

        }
        return rev;
    }
    }
//    }