import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temp;
        double convertedTemp;
        String choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? [C or F]: ");
        choice = scanner.next().toUpperCase();

        convertedTemp = (choice.equals("C") ? (temp - 32) * 5 /9 : (temp * 5 / 9) + 32);

        System.out.printf("The converted temp is: %.2f", convertedTemp);
        
    }
}