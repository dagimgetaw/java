public class Arithmetic {
    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        // arithmetic operator

        int sum = x + y;
        int min = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y;

        System.err.println(x + " + " + y + " = " + sum);
        System.err.println(x + " - " + y + " = " + min);
        System.err.println(x + " * " + y + " = " + mul);
        System.err.println(x + " / " + y + " = " + div);
        System.err.println(x + " % " + y + " = " + mod);


        // augmented operated

        x += y;
        System.err.println(x);


        // increment and decrement operator

        x++;
        System.err.println(x);


        // order of operation [P-E-M-D-A-S]

        int result = 8 / 2 + 2 - 2 * (4 + 2) - 9 / 3;
        System.err.println(result);

    }
}