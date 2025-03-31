import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] cars;
        int size;

        System.out.print("How many cars you want: ");
        size = scanner.nextInt();

        cars = new String[size];

        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter the car name: ");
            cars[i] = scanner.next();
        }

        int index = 0;

        System.out.println("----------------");
        System.out.println("Cars in your garage");
        for (String car : cars) {
            System.out.printf("%d: %s\n", index += 1, car);
        }
    }
}