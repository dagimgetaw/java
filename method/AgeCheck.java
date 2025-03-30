import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur age: ");
        age = scanner.nextInt();

        if (checkAge(age)) {
            System.out.print("U are welcome");
        } else {
            System.out.print("U are not welcome, u are underage.");
        }

    }
    static boolean checkAge(int age) {
        return age >= 18;
    }
}