/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length? ");
        String str1 = sc.nextLine();
        System.out.print("What is the width? ");
        String str2 = sc.nextLine();
        int length = Integer.parseInt(str1);
        int width = Integer.parseInt(str2);
        double area = length*width;
        double gallon = 350;
        double gallons2 = Math.ceil(area/gallon);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet", gallons2,area);
    }
}
