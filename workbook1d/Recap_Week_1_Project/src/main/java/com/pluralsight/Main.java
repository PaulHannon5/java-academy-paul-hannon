package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanScore = new Scanner(System.in);

        System.out.println("Enter exam score");
        int score = scanScore.nextInt();

        if (score >= 90 && score <= 99)
            System.out.println('A');
        else if (score >= 80 && score <= 89) {
            System.out.println('B');
        } else if (score >= 70 && score <=79) {
            System.out.println('C');
        } else if (score >= 60 && score <= 69) {
            System.out.println('D');
        } else if (score <= 59) {
            System.out.println('F');
        } else {
            System.out.println("Input Error");
        }
         scanScore.close();
        }


    }



