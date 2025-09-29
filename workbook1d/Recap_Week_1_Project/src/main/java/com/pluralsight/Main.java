package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanScore = new Scanner(System.in);

        System.out.println("Enter exam score");
        int score = scanScore.nextInt();

        if (score >= 90)
            System.out.println('A');
        else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');


        }

    }

    }
