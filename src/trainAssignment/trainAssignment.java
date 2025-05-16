package trainAssignment;

import java.util.Scanner;

public class trainAssignment {
    public void printTrain(){
        Scanner scanner = new Scanner(System.in);

        // Create an array to keep track of seats (0 means available, 1 means booked)
        int[] seats = new int[10];
        int totalSeats = 10;
        int bookedSeats = 0;

        System.out.println("Welcome to the Train Ticket Booking System!");

        // Loop until we decide to exit
        String choice = "yes";
        while (choice.equals("yes")) {
            // Check if train is full
            if (bookedSeats >= totalSeats) {
                System.out.println("Train is full.");
                break;
            }

            System.out.println("Available seats: " + (totalSeats - bookedSeats));
            System.out.print("Do you want to book a ticket? (yes/no): ");
            choice = scanner.nextLine();

            if (choice.equals("yes")) {
                // Find the first empty seat
                int seatNumber = 0;
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] == 0) {
                        seatNumber = i + 1;  // +1 because seats start from 1
                        seats[i] = 1;        // Mark as booked
                        bookedSeats++;       // Increase count of booked seats
                        break;
                    }
                }

                System.out.println("You have booked seat number: " + seatNumber);
            } else if (choice.equals("no")) {
                System.out.println("Thank you for using our booking system!");
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
                choice = "yes";  // Reset choice to continue the loop
            }
        }

        scanner.close();
    }
}
