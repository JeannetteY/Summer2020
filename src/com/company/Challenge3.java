package com.company;

public class Challenge3 {
    public static final int Size = 5;
    public static void main(String[] args) {
        Top();
        Bottom();
    }
    public static void Top() {
        char letter = 65;
        for (int i = Size; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");
            }
            System.out.println();
        }
    }
    public static void Bottom () {
        char letter = 65;
        for (int i = 0; i <= Size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j) + " ");

            }
            System.out.println();
        }
    }
}
