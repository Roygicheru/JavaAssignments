import atmAssignment.atmAssignment;
import parkingAssignment.parkingAssignment;
import trainAssignment.trainAssignment;

public class Main {
    public static void main(String[] args) {
        atmAssignment atmAssignment = new atmAssignment();
        atmAssignment.printAtm();

        parkingAssignment parkingAssignment = new parkingAssignment();
        parkingAssignment.printParking();

        trainAssignment trainAssignment = new trainAssignment();
        trainAssignment.printTrain();
    }
}
