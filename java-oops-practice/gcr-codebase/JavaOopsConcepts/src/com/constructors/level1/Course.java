package com.constructors.level1;

	public class Course {

	    // Instance variables (different for each course)
	    String courseName;
	    int duration;      // duration in months
	    double fee;

	    // Class variable (common for all courses)
	    static String instituteName = "TIT College";

	    // Constructor
	    Course(String courseName, int duration, double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // Instance method
	    void displayCourseDetails() {
	        System.out.println("Course Name: " + courseName);
	        System.out.println("Duration: " + duration + " months");
	        System.out.println("Fee: ₹" + fee);
	        System.out.println("Institute: " + instituteName);
	    }

	    // Class (static) method
	    static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }

	    // Main method
	    public static void main(String[] args) {

	        Course c1 = new Course("Java Full Stack", 6, 45000);
	        Course c2 = new Course("Cloud Computing", 4, 35000);

	        c1.displayCourseDetails();
	        System.out.println();

	        c2.displayCourseDetails();
	        System.out.println();

	        // Update institute name for all courses
	        Course.updateInstituteName("Prachi Institute of Technology");

	        System.out.println("After Updating Institute Name:\n");

	        c1.displayCourseDetails();
	        System.out.println();

	        c2.displayCourseDetails();
	    }
	}


