package Linked_List.Singly_Linked_List.Student_Record_Management_System;

public class StudentRecordManagement {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(1, "Aman", 20, "A");
        list.addAtEnd(2, "Riya", 21, "B");
        list.addAtPosition(2, 3, "Kunal", 19, "A");

        System.out.println("Student Records:");
        list.display();

        System.out.println("\nSearch Roll No 2:");
        list.searchByRollNo(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(2, "A+");

        System.out.println("\nDelete Roll No 1:");
        list.deleteByRollNo(1);

        System.out.println("\nFinal Records:");
        list.display();
    }
}

