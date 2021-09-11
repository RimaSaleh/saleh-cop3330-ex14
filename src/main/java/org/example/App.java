/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        double tax;

        //print statement asking for order amount to be inputted
        System.out.println( "What is the order amount? " );
        double order = scanner.nextDouble();

        //print statement asking for the state to be inputted
        System.out.println( "What is the state? " );
        String state = scanner.next();

        tax = 5.5 * order / 100;

        //if statement for WI state tax or else for non-residents
        if (state.equals("WI"))  {
            System.out.format("The subtotal is $%.2f\nThe tax is $%.2f\nThe total is $%.2f", order, tax, tax+ order);

            return;
        }
        System.out.format("The total is $%.2f", order);

    }
}