public class Main {
    public static void main(String[] args) {

        int temp = 20;

        // AND - all statement must be true
        if (temp >= 0 && temp <= 30) {
            System.err.println("The weather is good.");
        }

        boolean isSunny = false;

        // NOT - if it is false execute if not pass
        if (!isSunny) {
            System.err.println("It is cloddy.");
        }

        int tempTwo = -10;

        if (tempTwo < 0 || tempTwo > 30) {
            System.out.println("The weather is bad.");
        }
    }
}