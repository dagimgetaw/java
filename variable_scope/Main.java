public class Main {
    static int x = 10; // class variable
    public static void main(String[] args) {
        int x = 5; // local variable
        System.out.println(x);
        something();
    }
    static void something() {
        System.out.println(x);
    }
}