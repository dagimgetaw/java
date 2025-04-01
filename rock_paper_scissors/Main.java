import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Random random = new Random();

        String[] possibleChoice = {"rock","paper","scissor"};
        String userChoice, computerChoice;  
        boolean play = true;
        int userScore = 0, computerScore = 0;

        while (play) {
            computerChoice = possibleChoice[random.nextInt(0,3)];
            System.out.print("Enter your move (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();
            System.out.printf("Computer choice: %s\n", computerChoice);
            if (userChoice.equals(computerChoice)) {
                System.out.println("Draw");
            } else if (userChoice.equals("rock")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("Computer Win");
                    computerScore += 1;
                } else {
                    System.out.println("You Win");
                    userScore += 1;
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("Computer Win");
                    computerScore += 1;
                } else {
                    System.out.println("You Win");
                    userScore += 1;
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("Computer Win");
                    computerScore += 1;
                } else {
                    System.out.println("You Win");
                    userScore += 1;
                }
            } else {
                System.out.println("Invalid role!");
            }
            System.out.printf("User %d : %d Computer\n", userScore, computerScore);
            play = wantToPlay(play);
        }
    }
    static boolean wantToPlay(boolean play) {
        String wantPlay;
        System.out.print("Play again (yes/no): ");
        wantPlay = scanner.nextLine().toLowerCase();
        play = !wantPlay.equals("no");
        return play;
    }
}