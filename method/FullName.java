import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {

        String firstName, lastName;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur first name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter ur last name: ");
        lastName = scanner.nextLine();

        System.out.printf("Ur full name is %s.", getFullName(firstName, lastName));        
    }

    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
     }
}