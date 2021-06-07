package org.example;

import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        String password = "abc$123";

        System.out.print( "What is the password? ");
        String input = Obj.nextLine();

        if (input.equals(password))
            System.out.printf("Welcome!");
        else
            System.out.printf("I don't know you.");
    }
}