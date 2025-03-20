import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter ur name: ");
            name = scanner.nextLine();
        }

        System.out.printf("Hello, %s", name);

        String quit = "";

        while (!quit.equals("Q")) {
            System.out.println("\nU are playing the game!");
            System.out.print("Press Q to quit: ");
            quit = scanner.nextLine().toUpperCase();
        }

        System.out.print("U quite the game.");

        scanner.close();
    }
}