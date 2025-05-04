public class Student extends Person {

    double gpa;

    Student(String firstName, String lastName, double gpa) {
        super(firstName, lastName);
        this.gpa = gpa;
    }

    void showGPA() {
        System.out.println(firstName + " gpa is " + gpa);
    }
}