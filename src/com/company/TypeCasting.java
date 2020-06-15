package com.company;

public class TypeCasting {
    public static void main(String[] args) {
//        double num1 = 9.7;
//        int num2 = 5;
//        double total;
//        int total2;
//        total = num1 + num2;
//        System.out.println(total);
//        total2 = (int)num1 + num2; //typecasted nym1 from double to int
//        System.out.println(total2);
//        char letter= 45;
//        System.out.println("The letter is: "+letter);
//        System.out.println("The letter is: "+(char) (letter+1));

//        char letter = 65;
//        for(int i=0; i<26; i++) {
//            System.out.println((char)(letter+i) +" ");

//            char letter = 65;
//            for(int i=25; i>=0; i++) {
//                System.out.println((char)(letter+i) +" ");
//
        char letter = 65;
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");

            }
            System.out.println();
        }
    }
}
