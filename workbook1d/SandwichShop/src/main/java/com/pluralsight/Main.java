package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Would like a number 1 or 2?");
        int size = myScan.nextInt();

        double basePrice = 0.0;
        String sizeName = "";

        if (size == 1) {
            basePrice = 5.45;
            sizeName = ("1");
        } else if (size == 2) {
            basePrice = 8.95;
            sizeName = "2";
        } else {
            System.out.println("Select 1 or 2");
            return;
        }
        System.out.println("What is your age?");
        int age = myScan.nextInt();

        double discount = 0.0;

        if (age <= 17) {
            discount = .10;
        } else if (age >= 60) {
            discount = .20;
        } else {
            discount = 0.0;
        }
        double discountAmount = basePrice * discount;
        double finalPrice = basePrice - discountAmount;

        System.out.println("Final price is " + finalPrice);
    }
}