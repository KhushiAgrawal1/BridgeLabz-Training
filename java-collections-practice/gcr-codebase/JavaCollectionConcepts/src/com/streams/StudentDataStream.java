package com.streams;

import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "student.dat";

        // -------- Writing Data --------
        try (
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(fileName))
        ) {

            // Student details
            int rollNo = 101;
            String name = "Khushi";
            double gpa = 8.75;

            // Write data (primitive types)
            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data stored successfully!");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }

        // -------- Reading Data --------
        try (
            DataInputStream dis = new DataInputStream(
                    new FileInputStream(fileName))
        ) {

            // Read data (same order as written)
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\n--- Student Data Retrieved ---");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
