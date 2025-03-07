import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        System.out.print("What is ur name: ");
        String name = scanner.nextLine();

        System.out.print("What is ur age: ");
        int age = scanner.nextInt();

        System.out.print("What is ur height: ");
        double height = scanner.nextDouble();


        System.out.print("Hello " + name + " u are " + age + " years old. Ur height is " + height + "m.");
    }
}