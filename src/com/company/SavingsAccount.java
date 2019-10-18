package com.company;

public class SavingsAccount
{
    static double annualInterestRate;
    private double savingsBalance;

    public void setSavings(double num)
    {
        savingsBalance = num;
    }

    public double calculateMonthlyInterest()
    {
        double monthlyInterest = (savingsBalance * SavingsAccount.annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
        return savingsBalance;
    }

    public void modifyInterestRate(double newInterest)
    {
        annualInterestRate = newInterest;
    }

    public static void main(String[] args)
    {

    }
}
