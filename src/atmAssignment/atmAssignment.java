package atmAssignment;

import java.util.Scanner;

/*
    Problem 1.
    Simulate a train ticket booking system for 10 seats. Each time a user "books", assign a seat number.
    Once full, show message: "Train is full."
    Include input validation and seat availability checks.

    Problem 2.
    Simulate an ATM that: Accepts withdrawal amount. Checks if it is divisible by 100.
    Denies if insufficient balance or invalid amount.
    Dispenses cash using denominations (100s, 500s, 2000s)

    Problem 3.
    Write a Java program that calculates parking fees based on the following:

    First 2 hours: Free
    Next 3 hours: Rs. 10 per hour
    Beyond 5 hours: Rs. 15 per hour

    Throw InvalidDurationException if the number of hours is negative.

     */

public class atmAssignment {
    public void printAtm(){
        int balance = 10000;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the Withdrawal amount: "); // Prints prompt message on screen of the same line
        int N = myObj.nextInt();  // Reads integer from user

        if (N % 100 == 0){
            if(N <= balance){
                int count_100 = 0;
                int count_500 = 0;
                int count_2000 = 0;

                int remaining_amount = N;

                count_2000 = remaining_amount / 2000;
                remaining_amount = remaining_amount % 2000;

                count_500 = remaining_amount / 500;
                remaining_amount = remaining_amount % 500;

                count_100 = remaining_amount / 100;
                remaining_amount = remaining_amount % 100;


                System.out.println("Withdrawal successful");
                System.out.println("100 rupee notes: " + count_100);
                System.out.println("500 rupee notes: " + count_500);
                System.out.println("2000 rupee notes: " + count_2000);

            }else{
                System.out.println("Insufficient balance. Your balance is: " + balance);
            }
        } else{
            System.out.println("Invalid amount. Amount must be divisible by 100");
        }
    }
}
