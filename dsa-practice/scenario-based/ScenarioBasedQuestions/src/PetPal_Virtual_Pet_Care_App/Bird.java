package PetPal_Virtual_Pet_Care_App;

public class Bird extends Pet implements IInteractable {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        changeHunger(-10);
        System.out.println("Bird is eating");
    }

    public void play() {
        changeEnergy(-15);
        System.out.println("Bird is flying");
    }

    public void sleep() {
        changeEnergy(30);
        System.out.println("Bird is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}

