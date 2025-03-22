import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // number guessing game only have 5 life
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int life = 5;
        int target = random.nextInt(1, 31);
        boolean playGame = true;

        System.err.println(target);

        System.out.println("Guess the number between 1 - 30. U have 5 life.");

        while (playGame) {

            System.out.print("Enter ur estimated guess: ");
            guess = scanner.nextInt();

            if (guess == target) {
                System.out.printf("You won! U guessed correctly: %d", guess);
                playGame = false;

            }  else if (guess > 30 || guess < 0) {
                System.err.print("The target value only [1 - 30]\n");
                System.out.printf("U have %d life left\n",  life);

            } else if (guess < target) {
                System.err.printf("The target value is greater than %d\n", guess);
                System.out.printf("U have %d life left\n",  life);

            } else {
                System.err.printf("The target value is less than %d\n", guess);
                System.out.printf("U have %d life left\n",  life);
            }

            life -= 1;

            if (life < 0) {
                System.out.printf("U lose. The number was %d", target);
                playGame = false;
            } 
        }

        scanner.close();

    }
}