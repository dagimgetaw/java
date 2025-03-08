import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        double width;
        double length;

        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter the width: ");
        width = scanner.nextDouble();

        System.err.print("Enter the length: ");
        length = scanner.nextDouble();

        double area = width * length;

        System.err.println("The area is " + area + "m²");

    }
}