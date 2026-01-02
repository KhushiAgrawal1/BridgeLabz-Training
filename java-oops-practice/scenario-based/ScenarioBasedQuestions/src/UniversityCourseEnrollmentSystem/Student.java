package UniversityCourseEnrollmentSystem;

public class Student {
    protected int rollNo;
    protected String name;
    private double gpa;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public double getTranscript() {
        return gpa;
    }
}
