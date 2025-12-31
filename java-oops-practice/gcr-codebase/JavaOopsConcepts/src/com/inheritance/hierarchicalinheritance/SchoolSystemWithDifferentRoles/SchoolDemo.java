package com.inheritance.hierarchicalinheritance.SchoolSystemWithDifferentRoles;

public class SchoolDemo {
    public static void main(String[] args) {

        Teacher teacher =
                new Teacher("Mr. Sharma", 40, "Mathematics");

        Student student =
                new Student("Aarav", 16, "10th Grade");

        Staff staff =
                new Staff("Mrs. Verma", 35, "Administration");

        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}

