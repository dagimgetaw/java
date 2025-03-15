public class Main {
    public static void main(String[] args) {
        
        String name = "Java";

        int len = name.length(); 
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        String trim = name.trim();
        boolean isEmpty = name.isEmpty();
        boolean haveSpace = name.contains(" ");
        

        System.out.printf("The length of %s word is %d\n", name, len);
        System.out.println(upper);
        System.out.println(lower);
        System.err.println(trim);

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