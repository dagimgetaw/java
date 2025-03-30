public class Main {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4,6));
        System.out.println(add(2,4,6,8));

    }
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}