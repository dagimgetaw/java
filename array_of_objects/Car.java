public class Car {

    String name;
    String color;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void drive() {
        System.out.printf("You drive %s %s car.\n", this.color, this.name);
    }
}