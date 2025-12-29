package com.constructors.level1;


//Subclass
class Manager extends Employee {

 String designation;

 // Constructor
 Manager(int employeeID, String department, double salary, String designation) {
     super(employeeID, department, salary);
     this.designation = designation;
 }

 // Method demonstrating access to members
 void displayDetails() {
     System.out.println("Employee ID: " + employeeID);     // public
     System.out.println("Department: " + department);      // protected
     System.out.println("Salary: ₹" + getSalary());        // private via getter
     System.out.println("Designation: " + designation);
 }

 // Main method
 public static void main(String[] args) {

     Manager mgr = new Manager(
             101,
             "Human Resources",
             75000,
             "HR Manager"
     );

     mgr.displayDetails();

     // Modify salary
     mgr.setSalary(85000);

     System.out.println("\nAfter Salary Update:");
     mgr.displayDetails();
 }
}


