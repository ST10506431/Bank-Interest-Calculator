/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankinterestcalculator;

import java.util.Scanner;

/**
 *
 * @author hazel
 */

/*

Activity 4: Bank Interest Calculator
Objective: Learn how to apply an interest formula.
Steps to Follow:
1. Create a new Java project called BankInterestCalculator.
2. Import the Scanner class at the beginning.
3. Inside the main method, do the following:
o Ask the user to enter:
▪ Principal amount (P)
▪ Rate of interest (R)
▪ Time in years (T)
o Use the formula:
Simple Interest = (P × R × T) / 100
o Multiply the principal, rate, and time, then divide by 100.
o Display the interest earned.
*/
public class BankInterestCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter the amount in rands:");
        double amount = scan.nextDouble();
        
        System.out.print("Please enter the interest rate:");
        double rate = scan.nextDouble();
        
        System.out.print("Please enter the period of years:");
        double years = scan.nextDouble();
        
        double interest = (amount * rate * years) / 100;
        
        System.out.println("You entered:");
        System.out.println("R" + amount);
        System.out.println(rate + "% interest rate");
        System.out.println(years + " years");
        System.out.println("Your interst is : R"+interest);

        scan.close();
    }
}
