package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  *  Copyright 2021 Yeshwanth Mandava
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner saying = new Scanner(System.in);
        System.out.print("Enter any quote: ");
        String quote = saying.nextLine();

        Scanner creator = new Scanner(System.in);
        System.out.print("Who said this quote: ");
        String author = creator.nextLine();
        System.out.print(author + " says, " + "\""+quote+"\"");
    }
}