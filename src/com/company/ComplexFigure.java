package com.company;

public class ComplexFigure {
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }
    public static void Line(){
        System.out.println("#================#");
    }
    public static void Top() {
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void Bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}