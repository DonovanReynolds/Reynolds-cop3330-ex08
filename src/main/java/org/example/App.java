package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 8 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        String peopleText = inputOutput("How many people?");
        String pizzaText = inputOutput("How many pizzas do you have?");
        String slicesText = inputOutput("How many slices per pizza?");

        int people = Integer.parseInt(peopleText);
        int pizza = Integer.parseInt(pizzaText);
        int slices = Integer.parseInt(slicesText);
        int totalSlices = slices * pizza;
        int slicePerPerson = totalSlices/people;
        int leftovers = totalSlices%people;

        System.out.printf("%d people with %d pizzas(%d slices)\n",people,pizza,totalSlices);
        System.out.println("Each person gets " + slicePerPerson + " pieces of pizza.");
        System.out.println("There are " + leftovers + " leftover pieces.");

    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();
    }
}
