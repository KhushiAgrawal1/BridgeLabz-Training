package com.PetPal_Virtual_Pet_Care_App;

public class Dog extends Pet implements IInteractable {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        changeHunger(-20);
        System.out.println("Dog is eating");
    }

    public void play() {
        changeEnergy(-10);
        System.out.println("Dog is playing");
    }

    public void sleep() {
        changeEnergy(20);
        System.out.println("Dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

