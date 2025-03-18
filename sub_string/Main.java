import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur email address: ");
        String email = scanner.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.printf("username: %s\nemail: %s", username, domain);
    }
}