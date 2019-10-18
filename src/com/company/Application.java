package com.company;

import java.math.*;
public class Application
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavings(2000);
        saver2.setSavings(3000);
        saver1.modifyInterestRate(.4);
        saver2.modifyInterestRate(.4);
        System.out.println("Saver1 Balance: " + Math.round(saver1.calculateMonthlyInterest()) + "\nSaver2 Balance: " + Math.round(saver2.calculateMonthlyInterest()));

        saver1.modifyInterestRate(.5);
        saver2.modifyInterestRate(.5);
        System.out.println("\nSaver1 Balance: " + Math.round(saver1.calculateMonthlyInterest()) + "\nSaver2 Balance: " + Math.round(saver2.calculateMonthlyInterest()));

    }
}
