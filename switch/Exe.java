import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        
        String result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur grade [A, B, C, D, F]: ");
        result = scanner.nextLine().toUpperCase();

        switch (result) {
            case "A" -> System.out.print("Very Good!\nKeep it up!");
            case "B" -> System.out.print("Very Good!");
            case "C" -> System.out.print("Good!\nTry to improve it!");
            case "D" -> System.out.print("Must be improve for the next time!");
            case "F" -> System.out.print("Failed!");
            default -> System.out.print("Invalid Grade!");
        }
    }
}