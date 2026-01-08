package com.PetPal_Virtual_Pet_Care_App;

public class Cat extends Pet implements IInteractable {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        changeHunger(-15);
        System.out.println("Cat is eating");
    }

    public void play() {
        changeEnergy(-5);
        System.out.println("Cat is playing");
    }

    public void sleep() {
        changeEnergy(25);
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

