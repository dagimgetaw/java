public class Main {
    public static void main(String[] args) {
        
        String email = "email76@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1);

        System.out.printf("username: %s\nemail: %s", username, domain);
    }
}