import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        welcome();

        String[][] question = {{"1. What is the default value of a boolean variable in Java?\n\nA. true\nB. false\nC. null\nD. 0"},
                               {"2. Which keyword is used to prevent a method from being overridden?\n\nA. final\nB. static\nC. private\nD. abstract"},
                               {"3. Which of the following is NOT a primitive data type in Java?\n\nA. int\nB. string\nC. double\nD. char"},
                               {"4. What is the correct way to create an object of a class in Java?\n\nA. MyClass obj = new MyClass();\nB. MyClass obj();\nC. obj = MyClass();\nD. new MyClass obj;"},
                               {"5. Which exception is thrown when dividing by zero in Java for integers?\n\nA. NullPointerException\nB. ArithmeticException\nC. NumberFormatException\nD. IllegalArgumentException"}};

        char[] correctAnswer = {'B','A','B','A','B'};
        char answer;
        int index = 0;
        int score = 0;

        for (String quizzes[] : question) {
            for (String quiz : quizzes) {
                System.out.println(quiz);
                System.out.print("Your answer: ");
                answer = scanner.nextLine().toUpperCase().charAt(0);
                if (answer == correctAnswer[index]) {
                    correct();
                    score += 1;
                } else {
                    wrong();
                }
                index += 1;
            }
            System.out.println("");
        }
        finalScore(score, question);
        
    }
    static void welcome() {
        System.out.println("**************************");
        System.out.println("Welcome to java quiz game.");
        System.out.println("**************************");
    }
    static void correct() {
        System.out.println("\n*******");
        System.out.println("Correct");
        System.out.println("*******"); 
    }
    static void wrong() {
        System.out.println("\n*********");
        System.out.println("Incorrect");
        System.out.println("*********"); 
    }
    static void finalScore(int score, String[][] question) {
        System.out.println("********************************");
        System.out.printf("Your final score is: %d out of %d.\n", score, question.length);
        System.out.println("********************************");       
    }

}