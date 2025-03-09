
import java.util.Scanner;


public class Cart {
    public static void main(String[] args) {

        String item;
        double price;
        int quantity;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would u like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would u like?: ");
        quantity = scanner.nextInt();

        System.out.print("\n\n");

        double total_price = price * quantity;

        System.out.println("U have bought " + quantity + " " + item + "/s.");
        System.out.println("Ur total is $" + total_price + ".");
    }
}