/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String noun, verb, adjective, adverb;

        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter a adjective: ");
        adjective = scanner.nextLine();
        System.out.print("Enter a adverb: ");
        adverb = scanner.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }
}
