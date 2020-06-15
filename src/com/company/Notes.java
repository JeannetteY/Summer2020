package com.company;

public class Notes {
    public static void main(String[] args) {
        sayHi("Marty"); //strings need to be called later in order to work
        String name = "8";
        sayHi(name);
        String teacher = "Jeannette Yang";
//        System.out.println(teacher.substring(3, 7)); //printing a certain range of letters
        sayHi(teacher);
//        Challenge2.Line(); //you can call objects from other folders
    }
    public static void sayHi(String name) {
        System.out.println("This name is " + name.length() + " characters long");
        System.out.println("Hello " + name);
        int indexOf = name.indexOf("Y");
        System.out.println("The index is = " + indexOf);
        // if they Java doesn't find the character in the name the index will = -1
        if (indexOf > 0) { //this makes sure the -1 values don't mess up everything
            String lastName = name.substring(indexOf);
            System.out.println("The lastname is " + lastName);
        }
        if(name.length()>4) {
            char letter;
            letter = name.charAt(4);
            System.out.println("The character is " + letter);
        }
    }
}
