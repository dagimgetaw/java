public class Printf {
    public static void main(String[] args) {
        String name = "John";
        int age = 42;

        System.out.printf("%s is %d years old.\n", name, age);

        System.err.println("\n");

        double num1 = 10.23123;
        double num2 = 192.12;
        double num3 = -23123.12312;

        System.out.printf("%f\n", num1);
        System.out.printf("%f\n", num2);
        System.out.printf("%f\n", num3);

        System.err.println("\n");

        System.out.printf("%,f\n", num1);
        System.out.printf("%,f\n", num2);
        System.out.printf("%,f\n", num3);

        System.err.println("\n");

        System.out.printf("%(f\n", num1);
        System.out.printf("%(f\n", num2);
        System.out.printf("%(f\n", num3);
    }
}