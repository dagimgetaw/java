import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        do { 
            System.out.print("Enter ur name: ");
            name = scanner.nextLine();
        } while (name.isEmpty());

        System.out.printf("Hello, %s", name);

        scanner.close();
    }
}