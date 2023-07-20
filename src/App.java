import java.util.Scanner;
import java.util.Date;

public class App {

    public static void NewRegistration(int choice) {

        if (choice == 1) {
            // Walk-in Rental

            Date currentDate = new Date();
            System.out.println("Current Date and Time: " + currentDate);
            int currentYear = currentDate.getYear() + 1900; // Add 1900 to get the actual year
            int currentMonth = currentDate.getMonth() + 1; // Month starts from 0, so add 1
            int currentDay = currentDate.getDate();
            int currentHours = currentDate.getHours(); //24 hour Format will be used

           /* System.out.println("Year: " + currentYear);
            System.out.println("Month: " + currentMonth);
            System.out.println("Day: " + currentDay);
            System.out.println("Hours: " + currentHours);*/

            System.out.println("Current Time will be used as the starting time!");
            System.out.println("Tell me Ending Month: ");
            Scanner scanner = new Scanner(System.in);
            int endMonth = scanner.nextInt();
            System.out.println("Tell me Ending Day (of " + endMonth + "): ");
            int endDay = scanner.nextInt();
            System.out.println("Tell me Ending Hour (of " + endDay + ": ");
            int endHours = scanner.nextInt();

            System.out.println("Which car will like to choose? \nA: Audi\nB: Civic\nC: Cultus");
            String carName = scanner.nextLine();

            //Time Check Function (Check according to the car group whether it's feasible for that car or not)
            //It means to check the car availability for this specific period!!!

            //File Handling Part of Reservation_Search_Function (checking the last reservation ID)
            //Add +1 to the last ID and give it to the new CustomerID (if the Reservation status of specific customer is NULL)


            //Add Fee Structure From the Car Class


        } else if (choice == 2) {
            // Future Reservation
            // System.out.println("Future-Reservation Rental Entered");
            System.out.println("Tell me Starting Month: ");
            Scanner scanner = new Scanner(System.in);
            int startMonth = scanner.nextInt();
            System.out.println("Tell me Starting Day (of " + startMonth + "): ");
            int startDay = scanner.nextInt();
            System.out.println("Tell me Starting Hour (of " + startDay + ": ");
            int startHours = scanner.nextInt();

            System.out.println("Tell me Ending Month: ");
            int endMonth = scanner.nextInt();
            System.out.println("Tell me Ending Day (of " + endMonth + "): ");
            int endDay = scanner.nextInt();
            System.out.println("Tell me Ending Hour (of " + endDay + ": ");
            int endHours = scanner.nextInt();

            System.out.println("Which car will like to choose? \nA: Audi\nB: Civic\nC: Cultus");
            String carName = scanner.nextLine();

            //Time Check Function (Check according to the car group whether it's feasible for that car or not)
            //It means to check the car availability for this specific period!!!


            //File Handling Part of Reservation_Search_Function (checking the last reservation ID)
            //Add +1 to the last ID and give it to the new CustomerID (if the Reservation status of specific customer is NULL)


            //Add Fee Structure From the Car Class



        } else {
            System.out.println("Wrong Input! Please input the choice correctly (1 for Walk-in Rental OR 2 for Future Reservation)");
            return;
        }
    }

    public static void RecordRecievingStatus(Reservation Res){
        // This function will record the recieving status of the car
        // It will take the reservation object as input and will update the status of the car
        // It will also update the status of the reservation
        // It will also update the status of the customer
        // It will also update the status of the car group
        // It will also update the status of the branch
        // It will also update the status of the branch group
        // It will also update the status
        
        System.out.println("Record Recieving Status Entered");

        Res.setCarStatus(false);
        

    }

    public static void main(String[] args) {
        // Creating a Reservation object just to check the correct introduction of the reservation class in App.java
        //Reservation reservation = new Reservation(123, 456, "2023-07-13 10:00", "2023-07-14 10:00", 1233.44);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Car Rental System!");

        Car mainCar = new Car(2022, 2022, true, "2021-07-13 10:00", false);
        
        System.out.println("Enter the price of the car: Rs. ");
        double price = scanner.nextDouble();
        mainCar.setFeeStructure(price);

        System.out.println("Enter the tax of the car: Rs. ");
        double tax = scanner.nextDouble();
        mainCar.setTaxDetails(tax);

        //Write 1sr Part Here


        //2nd Part (Add New Reservation) starts from here --- Saleh's part
        System.out.println("Input Customer ID: ");
        int customerID = scanner.nextInt();

        //File Handling part of Customer_Search_Function!

        Customer customer;
        //Transfer data in the above newly made object!
        //Check customer status whether customer is allowed to perform reservation or not


        System.out.print("Please enter your choice of reservation: 1 for Walk-in Rental OR 2 for Future Reservation: ");
        int choice = scanner.nextInt();
        NewRegistration(choice);


        //Write 3rd Part Here



        //Write 4th Part Here

    }
}
