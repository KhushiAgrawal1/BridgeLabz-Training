package College_Information_System;

import java.util.ArrayList;

public class Course implements ICourseActions {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void enrollCourse(Student student) {
        students.add(student);
    }

    public void dropCourse(Student student) {
        students.remove(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        faculty.printDetails();
        System.out.println("Enrolled Students: " + students.size());
    }
}

