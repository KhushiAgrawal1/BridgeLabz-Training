package com.inheritance.hierarchicalinheritance.BankAccountTypes;

//Base class
class Employee {
 String name;
 int id;
 double salary;

 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + salary);
 }
}

//Manager subclass
class Manager extends Employee {
 int teamSize;

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Team Size: " + teamSize);
 }
}

//Developer subclass
class Developer extends Employee {
 String programmingLanguage;

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Language: " + programmingLanguage);
 }
}

//Intern subclass
class Intern extends Employee {
 int durationMonths;

 @Override
 void displayDetails() {
     super.displayDetails();
     System.out.println("Internship Duration: " + durationMonths + " months");
 }
}

//Main class
public class EmployeeTest {
 public static void main(String[] args) {
     Manager m = new Manager();
     m.name = "Amit";
     m.id = 101;
     m.salary = 80000;
     m.teamSize = 5;

     Developer d = new Developer();
     d.name = "Neha";
     d.id = 102;
     d.salary = 60000;
     d.programmingLanguage = "Java";

     Intern i = new Intern();
     i.name = "Rahul";
     i.id = 103;
     i.salary = 15000;
     i.durationMonths = 6;

     m.displayDetails();
     System.out.println();

     d.displayDetails();
     System.out.println();

     i.displayDetails();
 }
}

