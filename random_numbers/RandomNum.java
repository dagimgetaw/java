import java.util.Random;


public class RandomNum {
    public static void main(String[] args) {

        Random random = new Random();

        int num1;
        double num2;
        boolean status;

        num1 = random.nextInt(1,7);
        num2 = random.nextDouble();
        status = random.nextBoolean();

        System.out.println("Random int: " + num1);
        System.out.println("Random double: " + num2);
        System.out.print("Random boolean: " + status);
    }
}