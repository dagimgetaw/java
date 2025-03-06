public class Variable {
    public static void main(String[] args) {
        
        String name = "Josh";
        int age = 20;
        double height = 1.82;
        char blood = 'O';
        boolean isStudent = true;

        System.out.println(name + " is " + age + " years old, it height is " + height + " and his blood type is " + blood + ".");

        if (isStudent) {
            System.out.println(name + " is a student.");
        } else {
            System.out.println(name + " is not a student.");
        }
        
    }
}