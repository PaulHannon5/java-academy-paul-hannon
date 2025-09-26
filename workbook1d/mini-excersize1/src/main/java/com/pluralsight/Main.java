package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scnner = new Scanner(System.in);

        System.out.println("Enter Password");
        String password = scnner.next();

        String password1 = "1234";

        if(password.equals("1234")) {
            System.out.println("Correct Password!");

        } else {
            System.out.println("The password is incorrect");
    }

    }
}