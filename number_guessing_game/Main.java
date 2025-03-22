import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // number guessing game unlimited life
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int target = random.nextInt(1, 101);

        boolean playGame = true;

        while (playGame) {
            System.out.print("Enter ur estimated guess: ");
            guess = scanner.nextInt();

            if (guess == target) {
                System.out.printf("You won! U guessed correctly: %d", guess);
                playGame = false;
            }  else if (guess > 100 || guess < 0) {
                System.err.print("The target value only [0 - 100]\n");
            } else if (guess < target) {
                System.err.printf("The target value is greater than %d\n", guess);
            } else {
                System.err.printf("The target value is less than %d\n", guess);
            }
        }

        scanner.close();

    }
}