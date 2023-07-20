
import java.util.Scanner;

public class Customer {

    private String customer_name;
    private int customer_id;
    private String customer_email;
    private String credit_card_number;
    private String license_number;
    private boolean customer_status;
    private boolean customer_reservation_status;

    public Customer() {
        this.customer_name = "  ";
        this.customer_id = 0;
        this.customer_email = "  ";
        this.license_number = "  ";
        this.customer_status = false;
        this.customer_reservation_status = false;
    }

    public Customer(String customer_name, int customer_id, String customer_email, String credit_card_number, String license_number, boolean customer_status, boolean customer_reservation_status) {
        this.customer_name = customer_name;
        this.customer_id = customer_id;
        this.customer_email = customer_email;
        this.credit_card_number = credit_card_number;
        this.license_number = license_number;
        this.customer_status = customer_status;
        this.customer_reservation_status = customer_reservation_status;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name() {
        this.customer_name = customer_name;
    }
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public boolean isCustomer_status() {
        return customer_status;
    }

    public void setCustomer_status(boolean customer_status) {
        this.customer_status = customer_status;
    }

    public boolean isCustomer_reservation_status() {
        return customer_reservation_status;
    }

    public void setCustomer_reservation_status(boolean customer_reservation_status) {
        this.customer_reservation_status = customer_reservation_status;
    }

    public void ShowDetails() {
        System.out.println("The Customer name is  " + this.customer_name);
        System.out.println("The Customer Id is  " + this.customer_id);
        System.out.println("The Customer Email is  " + this.customer_email);
        System.out.println("The Customer Credit Card Number is  " +this.credit_card_number);
        System.out.println("The Customer License Number is  " + this.license_number);
        System.out.println("The Customer's status is  "+ this.customer_status);
        System.out.println("The Customer's Reservation Status is  " + this.customer_reservation_status);
    }
}
/*

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        // Create a new Customer object
        Customer customer1 = new Customer();

        // Get customer details from user input
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        customer1.setCustomer_name();

        System.out.print("Enter customer ID: ");
        int id  = scanner.nextInt();
        customer1.setCustomer_id(id);


        String Customer1Email = scanner.nextLine();
        customer1.setCustomer_email(Customer1Email);
        */
/*
        System.out.print("Enter customer email: ");
        String email = scanner.nextLine();
        customer1.setCustomer_email(email);
*//*


        System.out.print("Enter customer Credit Card Number: ");
        String creditcardnumber = scanner.nextLine();
        customer1.setCredit_card_number(creditcardnumber);

        System.out.print("Enter customer License Number: ");
        String licenseNumber = scanner.nextLine();
        customer1.setLicense_number(licenseNumber);

        System.out.print("Enter customer status: ");
        boolean customerStatus = scanner.nextBoolean();
        customer1.setCustomer_status(customerStatus);

        System.out.print("Enter customer reservation status: ");
        boolean customerReservationStatus = scanner.nextBoolean();
        customer1.setCustomer_reservation_status(customerReservationStatus);
        // Display customer details
        System.out.println("Customer Details:");
        customer1.ShowDetails();

    }

}
*/
