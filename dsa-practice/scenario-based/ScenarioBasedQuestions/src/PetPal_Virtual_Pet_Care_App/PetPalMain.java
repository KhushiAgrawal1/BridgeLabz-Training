package PetPal_Virtual_Pet_Care_App;

public class PetPalMain {
    public static void main(String[] args) {

        Pet pet = new Dog("Buddy", 3);   // Polymorphism
        IInteractable action = (IInteractable) pet;

        pet.makeSound();
        action.feed();
        action.play();
        action.sleep();

        pet.showStatus();
    }
}
