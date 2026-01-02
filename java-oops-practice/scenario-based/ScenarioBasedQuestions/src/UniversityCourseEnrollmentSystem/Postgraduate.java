package UniversityCourseEnrollmentSystem;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int rollNo, String name) {
        super(rollNo, name);
    }

    public void assignGrade(double marks) {
        setGPA(marks / 8);
    }
}

