import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int balance = 100;

    public static void main(String[] args) {
        String[] emoji = {"🔥", "💎", "🍉", "🍒", "🔔"};

        boolean play = true;

        do {
            int bet;
            char wantPlay;

            welcome();
            status(emoji);

            if (balance <= 0) {
                System.out.println("Game Over! You ran out of money.");
                play = false;
                return;
            }

            bet = getBetAmount();

            System.out.println("Spinning.............");
            result(emoji, bet);

            System.out.print("Do you want to play (y/n): ");
            wantPlay = scanner.next().toLowerCase().charAt(0);

            if (wantPlay == 'n') {
                System.out.println("Thanks for playing!");
                play = false;
            }
        } while (play);
    }

    static void welcome() {
        System.out.println("************************");
        System.out.println("Welcome to slots machine");
        System.out.println("************************");
    }

    static void status(String[] emoji) {
        for (String singleEmoji : emoji) {
            System.out.printf("%s ", singleEmoji);
        }
        System.out.print("\n");
        System.out.printf("Current balance: %d\n", balance);
    }

    static int getBetAmount() {
        int bet = 0;
        boolean validBet = false;

        while (!validBet) {
            System.out.print("Place your bet amount: ");
            if (scanner.hasNextInt()) {
                bet = scanner.nextInt();
                if (bet <= 0) {
                    System.out.println("\nMinimum you can bet is 1$");
                }
                else if (bet > balance) {
                    System.out.println("\nYou can't bet that much amount.");
                    System.out.printf("Your current balance: %d\n\n", balance);
                } else {
                    validBet = true;
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
            }
        }
        return bet;
    }

    static void result(String[] emoji, int bet) {
        int r1, r2, r3;
        String[] result = {"", "", ""};
        r1 = random.nextInt(emoji.length);
        r2 = random.nextInt(emoji.length);
        r3 = random.nextInt(emoji.length);

        System.out.println("*************");
        System.out.printf("%s | %s | %s\n", emoji[r1], emoji[r2], emoji[r3]);
        System.out.println("*************");

        result[0] = emoji[r1];
        result[1] = emoji[r2];
        result[2] = emoji[r3];

        calcResult(result, bet);
    }

    static void calcResult(String[] result, int bet) {
        String result1 = result[0];
        String result2 = result[1];
        String result3 = result[2];

        int change = 0;

        if ((result1.equals(result2) && result1.equals(result3)) && result2.equals(result3)) {
            if (result1.equals("🔥") && result2.equals("🔥") && result3.equals("🔥")) {
                change = bet * 10;
                balance += change;
                System.out.println("You hit the jackpot!");
                System.out.println("Super Win! 🚀");
            } else if ((result1.equals("💎") && result2.equals("💎") && result3.equals("💎")) ||
                    (result1.equals("🔔") && result2.equals("🔔") && result3.equals("🔔")) ||
                    (result1.equals("🍉") && result2.equals("🍉") && result3.equals("🍉"))) {
                change = bet * 5;
                balance += change;
                System.out.println("Big Win! 🎉");
            } else {
                change = bet * 3;
                balance += change;
                System.out.println("Medium Win! 🤑");
            }
        } else if ((result1.equals(result2) && !result2.equals(result3)) ||
                (result2.equals(result3) && !result1.equals(result2)) ||
                (result1.equals(result3) && !result1.equals(result2))) {
            change = bet * 2;
            balance += change;
            System.out.println("Small Win! 💰");
        } else {
            balance -= bet;
            System.out.println("You Lose! ❌");
        }
        System.out.printf("Your current balance: %d\n", balance);
    }
}
