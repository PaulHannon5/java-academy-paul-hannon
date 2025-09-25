package com.pluralsight;

import java.sql.SQLOutput;

public class Movie {
    {
        String movieName = "Jumper";
        int numberOfFriends = 7;
        double pizzaPrice = 4.99;
        boolean havePopcorn = true;

        System.out.println("Invite " + numberOfFriends + " friends over.");
        System.out.println("Order pizza for the price of $" + pizzaPrice + ".");
        System.out.println("Popcorn?" + havePopcorn);
        System.out.println("Pick and watch the movie " + movieName + ".");

        long rounded = Math.round(pizzaPrice);
        System.out.println("Rounded value: " + rounded );

        int newPizzaPrice = 5;
        boolean overPriced = false;

        if (newPizzaPrice > 30)
            System.out.println("Whoa, that's expensive pizza!");
        else
            System.out.println("Nice budget-friendly movie night!");
    }

}
