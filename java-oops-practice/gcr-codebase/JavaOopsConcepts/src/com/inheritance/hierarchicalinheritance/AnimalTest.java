package com.inheritance.hierarchicalinheritance.BankAccountTypes;

//Superclass
class Animal {
 String name;
 int age;

 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}

//Subclass Bird
class Bird extends Animal {
 @Override
 void makeSound() {
     System.out.println("Bird chirps");
 }
}

//Main class
public class AnimalTest {
 public static void main(String[] args) {
     Animal a1 = new Dog();
     Animal a2 = new Cat();
     Animal a3 = new Bird();

     a1.makeSound();
     a2.makeSound();
     a3.makeSound();
 }
}

