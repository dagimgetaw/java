import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        // hypotenuse

        double a;
        double b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the adjacent value: ");
        a = scanner.nextDouble();

        System.err.print("Enter the opposite value: ");
        b = scanner.nextDouble();

        double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.err.println("The hypotenuse value is " + result);


    }
}
