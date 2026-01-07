package College_Information_System;

public class CampusConnectMain {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Khushi", "khushi@college.edu");
        s1.addMarks(80);
        s1.addMarks(90);

        Faculty f1 = new Faculty(101, "Dr. Verma", "verma@college.edu", "CSE");

        Course c1 = new Course("Java Programming", f1);
        c1.enrollCourse(s1);

        s1.printDetails();      // Polymorphism
        f1.printDetails();      // Polymorphism
        c1.showCourseDetails();
    }
}

