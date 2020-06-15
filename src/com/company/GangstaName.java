package com.company;

import java.util.Scanner;

public class GangstaName {
    public static Scanner Console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Type your name player: ");
        String name = Console.nextLine();
        System.out.println("Your Gansta name is: ");
        GanstaName(name);
    }
    public static void GanstaName(String name) {
        char letter;
        letter = name.charAt(0);
        System.out.print(letter +".");
        System.out.print("Diddy ");
        int indexOf = name.indexOf(" ");
        String lastName = name.substring(indexOf+1);
        String s = lastName;
            s = s.toUpperCase();
            System.out.print(s +" ");
        System.out.print(name.substring(0, indexOf)+"-izzle");
    }
}
