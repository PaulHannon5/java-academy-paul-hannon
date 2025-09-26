package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Movie {
    {
        // Declaring variables
        String movieName = "Jumper";
        int numberOfFriends = 7;
        double pizzaPrice = 4.99;
        boolean havePopcorn = true;
        //

        int newPizzaPrice = 5;
        double drinkPrice = 3.59;

        long rounded = Math.round(pizzaPrice*(numberOfFriends+1));
        System.out.println("Rounded value of pizza: " + rounded);

        long rounded1 = Math.round(drinkPrice *(numberOfFriends+1));
        System.out.println("Rounded value of drinks: " + rounded1);

        int num1Friends = 7;
        int num2Drinks = 4;
        int totalCost = num1Friends * num2Drinks;

        int num1Friends1 = 7;
        int num2Pizza = 5;
        int totalCostOfPizza = num1Friends1 * num2Pizza;


        System.out.println("Invite " + numberOfFriends + " friends over.");
        System.out.println("Order pizza for the price of $" + pizzaPrice + ".");
        System.out.println("Popcorn? " + havePopcorn);
        System.out.println("Pick and watch the movie " + movieName + ".");
        System.out.println("The total cost of drinks is around $" + totalCost + " dollars.");
        System.out.println("The total cost of pizza is $" + totalCostOfPizza + " dollars.");

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter movie name: ");

        System.out.printf("Enter number of friends: ");
        int numberOfFriends1 = reader.nextInt();

        System.out.printf("Enter pizza price per slice (without dollar sign (e.g. 4.99 ");
        double priceOfPizza1 = reader.nextDouble();

        System.out.println("Is there popcorn? True or False");
        boolean havePopcorn1 = reader.nextBoolean();


        if (newPizzaPrice > 30)
            System.out.println("Whoa, that's expensive pizza!");
        else
            System.out.println("Nice budget-friendly movie night!");


    }

}
