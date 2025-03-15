public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You will get 20% senior discount");
                System.out.println("You will get 10% student discount");
                price *= 0.7;  
            } else {
                System.out.print("You will get 10% student discount");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.print("You will get 20% senior discount");
                price *= 0.8;  
            } else {
                price *= 1;
            }
        }

        System.out.printf("You ticket price is: %.2f$", price);
        
    }
}