
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to IS Car Rental System!");
        System.out.print("Pleas Enter Your Name: ");
        Scanner scanner1 = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name);
        System.out.print("Enter Your Password: ");
        String password = scanner.next();
        System.out.println(password);
    }
}
