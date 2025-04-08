public class Car {

    String name = "Ford";
    String model = "Mustang";
    String color = "Black";
    int year = 1996;
    double price = 360000.99;
    boolean isManual = true;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.printf("You drive the %s\n", model);
    }
    void brake() {
        System.out.printf("You brake the %s\n", model);
    }
}