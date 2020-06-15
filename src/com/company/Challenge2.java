package com.company;

public class Challenge2 {
    public static final int Size = 4;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }
    public static void Line() {
        System.out.print("+");
        for (int dash = 0; dash <= 2*Size; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void Top() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -1 * line + Size +1; spaces++) {
                System.out.print(" ");
            }
            for (int frontslash = 1; frontslash <= line - 1; frontslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int backslash = 1; backslash <= line - 1; backslash++) {
                System.out.print("\\");
            }
            for (int spaces = 1; spaces <= -1 * line + Size+1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line <= Size; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= line; spaces++) {
                System.out.print(" ");
            }
            for (int backslash = 1; backslash <= -1 * line + Size; backslash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int frontslash = 1; frontslash <= -1 * line + Size; frontslash++) {
                System.out.print("/");
            }
            for (int spaces = 1; spaces <= line; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}