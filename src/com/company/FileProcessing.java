package com.company;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class FileProcessing {
    public static void main(String[]args) throws FileNotFoundException
    {
        File file = new File("C:\\Users\\jeann\\IdeaProjects\\ComputerScience2020\\src\\com\\company\\weather txt");
        Scanner input = new Scanner(file);
        double temp1 = 0;
        if(input.hasNextDouble()){
            temp1 = input.nextDouble();
        }
        double temp2 = 0;
        boolean flag = false;
       while (input.hasNextLine()) {
           if (input.hasNextDouble()) {
               temp2 = input.nextDouble();
               flag = true;
           } else {
               String trash = input.next();
               flag = false;
           }
           if (flag) {
               System.out.printf("The difference of %5.2f and %5.2f is %7.2f\n" ,temp1 , temp2 , (temp2 - temp1));
               temp1 = temp2;
           }
       }
    }
}
