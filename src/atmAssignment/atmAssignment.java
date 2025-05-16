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
        Scanner scanner = new Scanner(System.in);

        // Initialize balance
        int balance = 5000;  // Kshs.

        System.out.println("Welcome to Simple ATM");
        System.out.println("Your balance: Kshs. " + balance);

        // Get withdrawal amount
        System.out.print("Enter amount to withdraw: Kshs. ");
        int amount = scanner.nextInt();

        // Check if amount is valid
        if (amount <= 0) {
            System.out.println("Invalid amount. Amount must be positive.");
        } else if (amount % 100 != 0) {
            System.out.println("Amount must be divisible by 100.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Your balance is Kshs. " + balance);
        } else {
            // Process the withdrawal
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: Kshs. " + balance);

            // Calculate notes to give
            int notes2000 = amount / 2000;
            amount = amount % 2000;

            int notes500 = amount / 500;
            amount = amount % 500;

            int notes100 = amount / 100;

            // Display notes
            System.out.println("Please take your cash:");
            System.out.println("Kshs. 2000 notes: " + notes2000);
            System.out.println("Kshs. 500 notes: " + notes500);
            System.out.println("Kshs. 100 notes: " + notes100);
        }

        scanner.close();
    }
}
