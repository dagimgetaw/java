import java.util.Scanner;

public class Main {
    static double balance = 0.0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        boolean work = true;

        while (work) {
            welcome();
            System.out.print("Enter your choice (1-4): ");

            if (!scanner.hasNextInt()) { 
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("\nYour balance is: %.2f$\n\n", showBalance());
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.print("\nAre you sure you want to exit? (yes/no): ");
                    String exitChoice = scanner.next().toLowerCase();
                    if (exitChoice.equals("yes")) {
                        System.out.println("\nThank you for using our Banking Program. Goodbye!");
                        work = false;
                    }
                    break;
                default:
                    System.out.println("Invalid Choice!! Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    static void welcome() {
        System.out.println("\n******************");
        System.out.println("    BANKING PROGRAM    ");
        System.out.println("******************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("******************");
    }

    static double showBalance() {
        return balance;
    }

    static void deposit() {
        System.out.print("\nEnter the amount you want to deposit: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid amount.");
            scanner.next();
            return;
        }

        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Minimum deposit amount is 1$.");
        } else {
            balance += depositAmount;
            System.out.println("Successfully deposited.");
            System.out.printf("Your current balance is: %.2f$\n\n", showBalance());
        }
    }

    static void withdraw() {
        System.out.print("\nEnter the amount you want to withdraw: ");

        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid amount.");
            scanner.next();
            return;
        }

        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else if (withdrawAmount <= 0) {
            System.out.println("Minimum withdrawal amount is 1$.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Successfully withdrawn.");
            System.out.printf("Your current balance is: %.2f$\n\n", showBalance());
        }
    }
}
