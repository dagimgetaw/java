import java.util.Scanner;


public class Radius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter the radius value: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference value is: " + circumference);
        System.out.println("The area value is: " + area);
        System.out.println("The volume value is: " + volume);
    }
}