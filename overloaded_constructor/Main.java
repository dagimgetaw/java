public class Main {
    public static void main(String[] args) {
        
        User user1 = new User();
        User user2 = new User("abebe");
        User user3 = new User("keede","kebede@gmail.com");
        User user4 = new User("dagim","dagim@gmail.com",21);

        System.out.println("User 1");
        System.out.printf("Username: %s\n", user1.username);
        System.out.printf("Email: %s\n", user1.email);
        System.out.printf("Age: %d\n", user1.age);

        System.out.println("");

        System.out.println("User 2");
        System.out.printf("Username: %s\n", user2.username);
        System.out.printf("Email: %s\n", user2.email);
        System.out.printf("Age: %d\n", user2.age);
                
        System.out.println("");

        System.out.println("User 3");
        System.out.printf("Username: %s\n", user3.username);
        System.out.printf("Email: %s\n", user3.email);
        System.out.printf("Age: %d\n", user3.age);
                
        System.out.println("");

        System.out.println("User 4");
        System.out.printf("Username: %s\n", user4.username);
        System.out.printf("Email: %s\n", user4.email);
        System.out.printf("Age: %d\n", user4.age);
        
    }
}