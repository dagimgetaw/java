public class Main {
    public static void main(String[] args) {
        
        String name = "Java";

        int len = name.length(); 
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String trim = name.trim();
        boolean isEmpty = name.isEmpty();
        boolean haveSpace = name.contains(" ");

        char letter = name.charAt(0);
        String replace = name.replace("J", "B");
        
        System.err.printf("first letter of the string %c\n", letter);
        System.out.printf("the length of %s word is %d\n", name, len);
        System.out.println(upper);
        System.out.println(lower);
        System.err.println(trim);
        System.err.printf("replace first letter to B %s\n", replace);

        if (isEmpty) {
            System.err.println("the string is empty string.");
        } else {
            System.out.println("it is not empty string.");
        }

        if (haveSpace) {
            System.err.println("ur name contain space.");
        } else {
            System.out.println("ur name doesn't contain space.");
        }

    }
}