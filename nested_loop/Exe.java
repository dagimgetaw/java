import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int row;
        int col;
        char symbol;

        System.out.print("Enter number of row: ");
        row = scanner.nextInt();

        System.out.print("Enter number of col: ");
        col = scanner.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(symbol);
            }
            System.out.println("");
        }

        scanner.close();
    }
}