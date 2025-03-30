import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = scanner.nextInt();

        System.out.printf("Square of %d is %d\n", num, square(num));

        System.out.printf("Cube of %d is %d", num, cube(num));
    }

    static int square(int num) {
       return num * num;
    }

    static int cube(int num) {
        return num * num * num;
    }
}