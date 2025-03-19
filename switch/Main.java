import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch (day) {
            case "monday" -> System.out.print("It is weekday.");
            case "tuesday" -> System.out.print("It is weekday.");
            case "wednesday" -> System.out.print("It is weekday.");
            case "thursday" -> System.out.print("It is weekday.");
            case "friday" -> System.out.print("It is weekday.");
            case "saturday" -> System.out.print("It is weekend.");
            case "sunday" -> System.out.print("It is weekend.");
            default -> System.out.print(day + " is not in the list.");
        }
    }
}