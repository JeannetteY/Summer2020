package com.company;

public class PrintFormating {
    public static void main (String []args){
        int doubly1 = (int)(Math.random()*10);
        double doubly2 = Math.max(doubly1,52.43);
        double doubly3 = Math.min(doubly1,doubly2);
        System.out.printf(" %10d \n %10.4f \n %10.4f \n", doubly1,doubly2,doubly3);
    }
}
