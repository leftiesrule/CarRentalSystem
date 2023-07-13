

import java.util.Scanner;

public class App {

    public static void NewRegistration(int choice) {
        if (choice == 1) {
            // Walk-in Rental
            System.out.println("Walk-in Rental Entered");

        } else if (choice == 2) {
            // Future Reservation
            System.out.println("Future-Reservation Rental Entered");

        } else {
            System.out.println("Wrong Input! Please input the choice correctly (1 for Walk-in Rental OR 2 for Future Reservation)");
            return;
        }
    }

    public static void main(String[] args) {
        // Creating a Reservation object just to check the correct introduction of the reservation class in App.java
        Reservation reservation = new Reservation(123, 456, "2023-07-13 10:00", "2023-07-14 10:00", 1233.44);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to IS Car Rental System!");

        System.out.print("Please enter your choice of reservation: 1 for Walk-in Rental OR 2 for Future Reservation: ");
        int choice = scanner.nextInt();
        NewRegistration(choice);
    }
}
