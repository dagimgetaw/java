public class Main {
    public static void main(String[] args) {

        Car car = new Car();  

        System.out.printf("Car name: %s\n", car.name); 
        System.out.printf("Car model: %s\n", car.model);
        System.out.printf("Car color: %s\n", car.color);
        System.out.printf("Car year: %d\n", car.year);
        System.out.printf("Car price: %.2f\n", car.price);
        System.out.printf("Is the car manual: %s\n", car.isManual);    

    }
}