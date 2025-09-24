package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class VariableApp {
    public static void main(String[] args) {
        // Declaring variables
        String favoriteColor = "Black";
        int yearStarted = 2025;
        char middleIntial = 'R';
        boolean havePets = true;
        String niceMessage = "Hello friend,";

        // Printing out values in complete sentences

        System.out.println("My favortite color is " + favoriteColor + ".");
        System.out.println("I started Year Up in " + yearStarted + ".");
        System.out.println("My middle intial is " + middleIntial + ".");
        System.out.println("It is " + havePets + " that I have pets.");
        System.out.println(niceMessage + " have a glorious day!");


        int numberDaysInWeek = 7;
        double priceCoffee = 4.99;
        char favoriteLetter = 'T';
        boolean isRaining = false;

        System.out.println("There are " + numberDaysInWeek + " days in a week.");
        System.out.println("The price of coffee is $ " + priceCoffee + "." );
        System.out.println("My favorite letter is " + favoriteLetter + ".");
        System.out.println("Rumors about it raining today are " + isRaining + ".");
    }

}
