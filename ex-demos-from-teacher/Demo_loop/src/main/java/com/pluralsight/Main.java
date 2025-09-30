package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I will be a good developer!");

        }
        for (int i = 0; i < 81; i++) {
            System.out.println("I have 81 days left of the year up academy.");
        }
        for (int i = 81; i > 1; i--) {
            System.out.printf("%d days left for year up academy.%n",i);
        }
        for (int i = 2; i <= 10; i+=2) {
            System.out.println(i);
        }
    }
}