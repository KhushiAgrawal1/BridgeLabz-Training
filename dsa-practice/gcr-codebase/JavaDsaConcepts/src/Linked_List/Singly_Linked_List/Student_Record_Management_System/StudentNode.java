package Linked_List.Singly_Linked_List.Student_Record_Management_System;

public class StudentNode {
    int rollNo;
    String name;
    int age;
    char grade;
    StudentNode next;

    public StudentNode(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

