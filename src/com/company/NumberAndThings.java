package com.company;
import java.util.*;
public class NumberAndThings {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        double doubly1 = 45.98;
        double doubly2 = Math.sqrt(doubly1);
        double doubly3 = doubly2 * 3.269;
        int num1 = 78;
        String answer;
        Random randy = new Random();
        do{
        int num2 = randy.nextInt(14)+75;
        System.out.printf(" \n %5d \n ", num2);
//        String valName = "Greenhill is awesome";
//        System.out.printf("%20.15s \n", valName);
        System.out.println("Do you want to keep going");
        answer = input.next();
    }

        while(answer.contains("y"));

// the s after the number shows the number of spaces.number of characters
//        System.out.println(doubly1);
//        System.out.println(doubly2);
//        System.out.println(doubly3);
//        System.out.println(num1);
//        System.out.println(num2);
    }
}
