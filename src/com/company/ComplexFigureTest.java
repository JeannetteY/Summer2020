package com.company;

public class ComplexFigureTest {
    public static final int SIZE=6;
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");
        for (int dash = 0; dash < 4*SIZE; dash++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= -2 * line + 2*SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - SIZE+2; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= -2 * line + 2*SIZE; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int upside = 1; upside < SIZE+1; upside++) {
            System.out.print("|");
            for (int spaces = 1; spaces <= 2 * upside - SIZE/2+1; spaces++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dots = 1; dots <= -4 * upside + 4*SIZE; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spaces = 1; spaces <= 2 * upside - SIZE/2+1; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
