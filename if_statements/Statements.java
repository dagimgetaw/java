import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur age: ");
        age = scanner.nextInt();

        if (age < 0) {
            System.out.print("U are not born yet.");
        } else if (age >= 0 && age <= 1) {
            System.out.print("U are Infant.");
        } else if (age >= 2 && age <= 4) {
            System.out.print("U are Toddler.");
        } else if (age >= 5 && age <= 12) {
            System.out.print("U are Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.print("U are Teen.");
        } else if (age >= 20 && age <= 39) {
            System.out.print("U are Adult.");
        } else if (age >= 49 && age <= 59) {
            System.out.print("U are Middle age adult.");
        } else {
            System.out.print("U are Senior adult.");
        }
    }
}