package UniversityCourseEnrollmentSystem;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int rollNo, String name) {
        super(rollNo, name);
    }

    public void assignGrade(double marks) {
        setGPA(marks / 10);
    }
}
