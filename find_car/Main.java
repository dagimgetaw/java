import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String[] cars = {"ford","ferrari","g wagon", "bugatti","bmw"};
        boolean isFound = false;
        String carName;

        System.out.print("Enter the car you want to search: ");
        carName = scanner.nextLine().toLowerCase();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(carName)) {
                System.out.printf("Car found at index %d", i);
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.out.println("Car not found.");
        }
    }
}