public class Main {
    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        System.out.println(ave(80,90,60,81,98));
    }
    static int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
    static double ave(double... numbers) {
        int sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}