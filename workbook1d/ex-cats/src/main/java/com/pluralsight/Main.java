package com.pluralsight;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Primitive variables
        String favColor = "Black";
        String favArtist = "Daft Punk";
        boolean didEat = false;
        int age = 21;
        String firstName = "Paul";
        String lastName = "Hannon";
        lastName = "Dinoguy";
        String newFullname = firstName + " " + lastName;
        System.out.println(favColor);
        System.out.println(favArtist);
        System.out.println(didEat);
        System.out.println(age);
        System.out.println(firstName);
        System.out.println(lastName);

        boolean isHappy = true;
        boolean eatenBreakfast = false;

        if (isHappy && eatenBreakfast) {
            System.out.println("Nice job!");
        } else if (isHappy && !eatenBreakfast) {
            System.out.println("You're happy but hungry");
        } else if (!isHappy && eatenBreakfast) {
            System.out.println("Do something about it");
        }
    }}