public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Abebe", 23, 3.79);
        Student student2 = new Student("Kebede", 24, 3.82);

        System.err.println("Student 1");
        System.err.printf("Name: %s\n",student1.name);
        System.err.printf("Age: %d\n",student1.age);
        System.err.printf("GPA: %.2f\n",student1.gpa);
        System.err.printf("Is enrolled: %s\n",student1.isEnrolled);

        System.out.println("");

        System.err.println("Student 2");
        System.err.printf("Name: %s\n",student2.name);
        System.err.printf("Age: %d\n",student2.age);
        System.err.printf("GPA: %.2f\n",student2.gpa);
        System.err.printf("Is enrolled: %s\n",student2.isEnrolled);

        System.out.println("");

        student1.isStudying();
        student2.isStudying();
    }
}