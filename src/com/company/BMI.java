package com.company;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your height in inches?");
        double height = input.nextDouble();

        System.out.println("What is your weight in pounds?");
        double weight = input.nextDouble();

        double BMI = weight/Math.pow(height,2) *703;
        System.out.println("Your BMI is: " +BMI);

        if (BMI <=18.5) {
            System.out.println("Your underweight");
        }
        else if (BMI <25.0){
            System.out.println("Your normal");
        }
        else if (BMI <30.0){
            System.out.println("Your overweight");

        }
        else if (BMI >=30.0){
            System.out.println("Your obese");
        }

        //friends BMI
        System.out.println("What is your friends height in inches?");
        double height2 = input.nextDouble();

        System.out.println("What is your friends weight in pounds?");
        double weight2 = input.nextDouble();

        double BMI2 = weight2/Math.pow(height2,2) *703;
        System.out.println("Your friends BMI is: " +BMI2);

        //friends BMI rating
        if (BMI2 <=18.5) {
            System.out.println("Your friends underweight");
        }
        else if (BMI2 <25.0){
            System.out.println("Your friends normal");

        }
        else if (BMI2 <30.0){
            System.out.println("Your friends overweight");

        }
        else if (BMI2 >=30.0) {
            System.out.println("Your friends obese");
        }
            double difference = (BMI - BMI2);
            System.out.println("The difference in BMI between you and your friend is: " +difference);

    }
}
