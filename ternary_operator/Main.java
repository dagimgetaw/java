public class Main {
    public static void main(String[] args) {
        
        int grade = 80;
        String check = (grade >= 70) ? "pass" : "fail";
        System.out.printf("%d %s the test.\n", grade, check);

        int num = 3;
        String oddEven = (num %2 == 0) ? "even" : "odd";
        System.out.printf("%d is %s.\n", num, oddEven);

        int hour = 10;
        String AMPM = (hour < 12) ? "AM" : "PM";
        System.out.printf("%d is %s.\n", hour, AMPM);

        int income = 50000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.printf("for income: %d tax rate is: %.2f.", income, taxRate);

    }
}