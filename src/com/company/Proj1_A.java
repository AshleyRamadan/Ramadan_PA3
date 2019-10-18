package com.company;
import java.util.Scanner;
import java.security.SecureRandom;
import java.math.BigDecimal;
public class Proj1_A {


    // print when answer is right
    public static void positiveResponse(SecureRandom numbers)
    {
        int random = numbers.nextInt(5);
        switch(random) {
            case 1:
                System.out.println("Very good!");
                break;

            case 2:
                System.out.println("Excellent!");
                break;

            case 3:
                System.out.println("Nice work!");
                break;

            case 4:
                System.out.println("Keep up the good work!");
                break;

        }
        return;
    }

    // print when answer is wrong
    public static void negativeResponse(SecureRandom numbers)
    {
        int random = numbers.nextInt(5);
        switch(random) {
            case 1:
                System.out.println("No. Please try again.");
                break;

            case 2:
                System.out.println("Wrong. Try once more.");
                break;

            case 3:
                System.out.println("Don't give up!");
                break;

            case 4:
                System.out.println("No. Keep trying.");
                break;

        }
        return;
    }

    public static void checker (double answer, double response)
    {

    }
    public static void addition(int score[], Scanner scan, SecureRandom numbers, int a, int b)
    {
        int answer;
        System.out.println("How much is " + a + " plus " + b + "?");
        answer = scan.nextInt();

        if (answer == (a + b))
        {
            positiveResponse(numbers);
            score[0]++;
            return;
        }
        else
        {
            negativeResponse(numbers);
            score[1]++;
            return;
        }
    }

    public static void subtraction(int score[], Scanner scan, SecureRandom numbers, int a, int b)
    {
        int answer;
        System.out.println("How much is " + a + " minus " + b + "?");
        answer = scan.nextInt();

        if (answer == (a - b))
        {
            positiveResponse(numbers);
            score[0]++;
            return;
        }
        else
        {
            negativeResponse(numbers);
            score[1]++;
            return;
        }
    }
    public static void multiplication(int score[], Scanner scan, SecureRandom numbers, int a, int b)
    {
        int answer;
        System.out.println("How much is " + a + " times " + b + "?");
        answer = scan.nextInt();

        if (answer == (a * b))
        {
            positiveResponse(numbers);
            score[0]++;
            return;
        }
        else
        {
            negativeResponse(numbers);
            score[1]++;
            return;
        }
    }
    public static void division(int score[], Scanner scan, SecureRandom numbers, int a, int b)
    {
        int answer;
        System.out.println("How much is " + a + " divided by " + b + "?");
        answer = scan.nextInt();

        if (answer == (a / b))
        {
            positiveResponse(numbers);
            score[0]++;
            return;
        }
        else
        {
            negativeResponse(numbers);
            score[1]++;
            return;
        }
    }
    public static void askQuestion(SecureRandom numbers, Scanner scan, int score[], int level, int arithmetic)
    {

        int a, b;
        int random = 0;

        // difficulty level
        if (level == 1)
        {
            a = numbers.nextInt(10);
            b = (numbers.nextInt(10));
        }
        else if (level == 2)
        {
            a = numbers.nextInt(100);
            b = (numbers.nextInt(100));
        }
        else if (level == 3)
        {
            a = numbers.nextInt(1000);
            b = (numbers.nextInt(1000));
        }
        else if (level == 4)
        {
            a = numbers.nextInt(10000);
            b = (numbers.nextInt(10000));
        }
        else
        {
            System.out.println("Invalid level. Quit.");
            return;
        }

        // if user picks random, each problem is randomized here
        if (arithmetic == 5)
            random = numbers.nextInt(5);

        if (arithmetic == 2 || random == 2)
            subtraction(score, scan, numbers, a, b);
        else if (arithmetic == 3 || random == 3)
            multiplication(score, scan, numbers, a, b);
        else if (arithmetic == 4 || random == 4)
            division(score, scan, numbers, a, b);
        else if (arithmetic == 1 || random == 1)
            addition(score, scan, numbers, a, b);
    }

    public static void start()
    {
        int i;
        double percent;
        int level;
        int arithmetic;


        SecureRandom numbers = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        System.out.println("What type of arithmetic problems would you like to do? \n Options: \n (1) Addition Problems \n (2) Subtraction Problems \n (3) Multiplication Problems \n (4) Division Problems \n (5) Random");
        arithmetic = scan.nextInt();

        System.out.println("Choose your difficulty level: (1 - 4)");
        level = scan.nextInt();

        int score[] = new int[2];
        score[0] = 0;
        score[0] = 0;

        for (i = 0; i <= 10; i++) {
            askQuestion(numbers, scan, score, level, arithmetic);
        }

        percent = (((score[0]) * 1.0) / 10.0) * 100.0;
        if (percent < 75.0)
            System.out.println("Please ask your teacher for help.");
        else {
            System.out.println("Congratulations, you are ready to go to the next level!");
            start();
        }
    }
    public static void main(String[] args) {
        start();
    }
}
