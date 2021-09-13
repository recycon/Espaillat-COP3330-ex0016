package org.example;

import java.util.Scanner;

/**
 *
 *
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */


public class App 
{

    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in);
        System.out.print( "What is your age? " );
        int age=in.nextInt();
        int legal=16;
        if(age>legal){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }
    }
}
