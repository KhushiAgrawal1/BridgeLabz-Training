package Linked_List.Student_Record_Management_System;

import java.util.Scanner;

public class StudentLinkedList {
    StudentNode head;

    // Add at beginning
    void addAtBeginning(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int rollNo, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        StudentNode newNode = new StudentNode(rollNo, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by roll number
    void deleteByRollNo(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Search student
    void search(int rollNo) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    void updateGrade(int rollNo, char grade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    void displayAll() {
        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    void displayStudent(StudentNode s) {
        System.out.println(
                "Roll No: " + s.rollNo +
                ", Name: " + s.name +
                ", Age: " + s.age +
                ", Grade: " + s.grade
        );
    }

    // Main method
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, 'A');
        list.addAtEnd(2, "Riya", 21, 'B');
        list.addAtPosition(2, 3, "Karan", 19, 'A');

        list.displayAll();

        list.updateGrade(2, 'A');
        list.search(2);
        list.deleteByRollNo(1);

        System.out.println("\nAfter Deletion:");
        list.displayAll();
    }
}
