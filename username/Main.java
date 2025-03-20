import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter ur username: ");
        username = scanner.nextLine();

        int len = username.length();
        boolean space = username.contains(" ");
        boolean underscore = username.contains("_");

        if (len < 4 || len > 12) {
            System.out.println("Username must be 4-12 character.");

        } else if (space || underscore) {
            System.out.println("Username can't contain space or underscore.");
        }
        else {
            System.err.printf("Welcome, %s.", username);
        }

        scanner.close();
    }
}