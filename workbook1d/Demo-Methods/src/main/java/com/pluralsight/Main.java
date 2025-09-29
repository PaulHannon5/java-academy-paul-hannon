package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        doubledAge(21);
    }

    public static void doubledAge(int age) {
        int doubledAge = age * 2;
        System.out.println("The double age is " + doubledAge);

        int retirementAge = 60;
        int yearsToRetirement = retirementAge - age;

        if(yearsToRetirement > 39){
            System.out.println("Years left until retirement: " + yearsToRetirement);
        } else {
            System.out.println("You've retired, congrats.");


        }


    }

}