import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.err.print("Enter initial principal balance: ");
        double p = scanner.nextDouble();
        
        System.out.print("Enter interest rate in percent: ");
        double r = scanner.nextDouble() / 100;

        System.out.print("Enter number of times interest applied per time period: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of time periods elapsed: ");
        int t = scanner.nextInt();

        double result = p * Math.pow(1 + (r / n), n * t);

        System.out.printf("The amount after %d years is $%.2f", t, result);

    }
}