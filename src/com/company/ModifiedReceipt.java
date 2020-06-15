package com.company;

public class ModifiedReceipt {
    public static void main(String [] args){
        int bill1 = 30;
        int bill2 = 48;
        int bill3 = 32;
        int subtotal = bill1+bill2+bill3;
        final double TAX = 0.08;
        final double TIP = 0.15;
        double taxes = subtotal * TAX;
        double tip = subtotal * TIP;
        double total = subtotal+taxes+tip;
        System.out.println("Subtotal:$"+subtotal);
        System.out.println("Tax:$"+taxes);
        System.out.println("Tip:$"+tip);
        System.out.println("Total:$"+total);
    }
}
