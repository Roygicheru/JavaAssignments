package parkingAssignment;
import java.util.Scanner;

public class parkingAssignment {
    public void printParking(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Parking Fee Calculator");
        System.out.print("Enter parking duration (in hours): ");
        int hours = scanner.nextInt();

        // Check for negative hours
        if (hours < 0) {
            System.out.println("Error: Parking duration cannot be negative.");
        } else {
            // Calculate the fee
            int fee = 0;

            // First 2 hours: Free
            if (hours <= 2) {
                fee = 0;
            }
            // Next 3 hours (hours 3-5): Kshs. 10 per hour
            else if (hours <= 5) {
                fee = (hours - 2) * 10;
            }
            // Beyond 5 hours: Kshs. 10 per hour for hours 3-5, then Kshs. 15 per hour
            else {
                fee = 3 * 10 + (hours - 5) * 15;
            }

            System.out.println("Parking fee: Kshs. " + fee);
        }

        scanner.close();
    }
}
