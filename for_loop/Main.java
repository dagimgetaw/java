import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Hi*"+i);
        }

        for (int i = 0; i <= 10; i += 2) {
            System.err.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        int loop;
        String text;

        System.out.print("Enter how many time u want to loop: ");
        loop = scanner.nextInt();

        System.out.print("What text u want to be displayed: ");
        text = scanner.next();

        for (int i = 1; i <= loop; i++) {
            System.out.printf("%d: %s.\n", i, text);
        }

        scanner.close();

    }
}