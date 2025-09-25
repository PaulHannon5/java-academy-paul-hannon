package com.pluralsight;

import java.sql.SQLOutput;

public class Movie {
    {
        // Declaring variables
        String movieName = "Jumper";
        int numberOfFriends = 7;
        double pizzaPrice = 4.99;
        boolean havePopcorn = true;
        //
        System.out.println("Invite " + numberOfFriends + " friends over.");
        System.out.println("Order pizza for the price of $" + pizzaPrice + ".");
        System.out.println("Popcorn? " + havePopcorn);
        System.out.println("Pick and watch the movie " + movieName + ".");

        int newPizzaPrice = 5;
        double drinkPrice = 3.59;

        long rounded = Math.round(pizzaPrice);
        System.out.println("Rounded value of pizza: " + rounded);

        long rounded1 = Math.round(drinkPrice);
        System.out.println("Rounded value of drinks: " + rounded1);

        int num1Friends = 7;
        int num2Drinks = 4;

        int totalCost = num1Friends * num2Drinks;
        System.out.println("The total cost of drinks is around $" + totalCost + " dollars.");

        if (newPizzaPrice > 30)
            System.out.println("Whoa, that's expensive pizza!");
        else
            System.out.println("Nice budget-friendly movie night!");
    }

}
