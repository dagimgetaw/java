import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double firstNum;
        double lastNum;
        double result;
        String symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        symbol = scanner.next();
        
        System.out.print("Enter the last number: ");
        lastNum = scanner.nextDouble();

        switch (symbol) {
            case "+" -> {
                result = firstNum + lastNum;    
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, symbol, lastNum, result);
            }
            case "-" -> {
                result = firstNum - lastNum;    
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, symbol, lastNum, result);
            }
            case "*" -> {
                result = firstNum * lastNum;    
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, symbol, lastNum, result);
            }
            case "/" -> {
                if (lastNum == 0) {
                    System.err.print("Can't divide by zero.");
                } else {
                    result = firstNum / lastNum;    
                    System.out.printf("%.2f %s %.2f = %.2f", firstNum, symbol, lastNum, result);
                }
            }
            case "^" -> {
                result = Math.pow(firstNum, lastNum);    
                System.out.printf("%.2f %s %.2f = %.2f", firstNum, symbol, lastNum, result);
            }
            default -> System.out.print("Invalid operator!");

        }
    }
}