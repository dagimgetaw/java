import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur name: ");
        name = scanner.nextLine();

        System.out.print("Enter ur age: ");
        age = scanner.nextInt();

        greeting(name, age);

    }
    static void greeting(String name, int age) {
        System.out.printf("Welcome, %s\nU are %d old.", name, age);
    }
}