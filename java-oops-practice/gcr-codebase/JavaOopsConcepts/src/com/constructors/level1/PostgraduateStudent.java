package com.constructors.level1;



	// Subclass
	public class PostgraduateStudent extends Student {

    String specialization;

    // Constructor
    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    // Method demonstrating protected access
    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);   // public
        System.out.println("Name: " + name);                 // protected
        System.out.println("CGPA: " + getCGPA());            // private via getter
        System.out.println("Specialization: " + specialization);
    }

    // Main method
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(
                101, "Khushi Agrawal", 8.6, "Computer Science"
        );

        pg.displayDetails();

        // Modify CGPA
        pg.setCGPA(9.0);

        System.out.println("\nAfter CGPA Update:");
        pg.displayDetails();
    }
}

