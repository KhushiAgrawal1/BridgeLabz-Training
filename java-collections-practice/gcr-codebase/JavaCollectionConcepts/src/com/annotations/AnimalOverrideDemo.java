package com.annotations;

public class AnimalOverrideDemo {

    // Parent class
    static class Animal {
        public void makeSound() {
            System.out.println("Some generic animal sound");
        }
    }

    // Child class overriding makeSound()
    static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof Woof!");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();  // Calls overridden method
    }
}

