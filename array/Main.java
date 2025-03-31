import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        String[] cars = {"Ford","Ferrari","G Wagon", "Bugatti","BMW"};

        System.out.printf("First value is: %s\n", cars[0]);
        System.out.printf("Total length of the array: %d\n", cars.length);
        System.out.println("----------------");
        for (int i = 0; i < cars.length; i++) {
            System.out.printf("%d: %s\n", i, cars[i]);
        }
        System.out.println("----------------");
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("----------------");
        Arrays.sort(cars);
        System.out.println("Sorted array");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}