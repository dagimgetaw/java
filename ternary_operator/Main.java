public class Main {
    public static void main(String[] args) {
        
        int grade = 80;
        String check = (grade >= 70) ? "pass" : "fail";
        System.out.printf("%d %s the test.\n", grade, check);

        int num = 3;
        String oddEven = (num %2 == 0) ? "even" : "odd";
        System.out.printf("%d is %s.\n", num, oddEven);

    }
}