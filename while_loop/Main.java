import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter ur name: ");
            name = scanner.nextLine();
        }

        System.out.printf("Hello, %s\n", name);

        String quit = "";

        while (!quit.equals("Q")) {
            System.out.println("U are playing the game!");
            System.out.print("Press Q to quit: ");
            quit = scanner.nextLine().toUpperCase();
        }

        System.out.println("U quite the game.");

        int age = 0;

        System.out.print("Enter ur age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Ur age can't be negative.");
            System.out.print("Enter ur age: ");
            age = scanner.nextInt();
        }

        System.out.printf("U are %d years old.", age);

        scanner.close();
    }
}