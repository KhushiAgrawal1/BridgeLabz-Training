package University_Course_Enrollment_System;

public class Student {
    protected int roll;
    protected String name;
    private double gpa;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    protected void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public void showTranscript() {
        System.out.println(name + " GPA: " + gpa);
    }
}
