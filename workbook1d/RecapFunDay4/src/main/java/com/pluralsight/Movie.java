package com.pluralsight;

import java.sql.SQLOutput;

public class Movie {
    {
        String movieName = "Jumper";
        int numberOfFriends = 7;
        double pizzaPrice = 4.99;
        boolean havePopcorn = true;

        System.out.println("Invite " + numberOfFriends + " over.");
        System.out.println("Order pizza for the price of $" + pizzaPrice + ".");
        System.out.println("Popcorn?" + havePopcorn);
        System.out.println("Pick and watch the movie " + movieName + ".");
    }

}
