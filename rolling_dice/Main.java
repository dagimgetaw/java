import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int noDice, total = 0;

        System.out.print("Enter the no of dice to roll: ");
        noDice = scanner.nextInt();

        if (noDice > 0) {
            for (int i = 0; i < noDice; i++) {
                int roll = random.nextInt(1, 7);
                total += roll;
                System.out.printf("You rolled: %d\n", roll);
                dice(roll);
            }
            System.out.printf("Total value: %d\n", total);
        } else {
            System.out.println("No of dice must be greater than zero!");
        }
    }
    static void dice(int roll) {
        String dice1 = """
                 ---------
                |         |
                |    ●    |
                |         |
                 ---------
        """;
        String dice2 = """
                 ---------
                |  ●      |
                |         |
                |      ●  |
                 ---------
        """;
        String dice3 = """
                 ---------
                |  ●      |
                |    ●    |
                |      ●  |
                 ---------
        """;
        String dice4 = """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 ---------
        """;
        String dice5 = """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 ---------
        """;
        String dice6 = """
                 ---------
                | ●  ●  ● |
                |         |
                | ●  ●  ● |
                 ---------
        """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default ->System.out.println("Invalid roll");
        }
    }
}