package PetPal_Virtual_Pet_Care_App;
public class Pet {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.hunger = 50;
        this.energy = 50;
        this.mood = "Neutral";
    }

    protected void changeHunger(int value) {
        hunger += value;
        updateMood();
    }

    protected void changeEnergy(int value) {
        energy += value;
        updateMood();
    }

    private void updateMood() {
        if (energy > 70 && hunger < 30)
            mood = "Happy";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Neutral";
    }

    public void showStatus() {
        System.out.println(name + " Mood: " + mood);
    }

    public void makeSound() {
        System.out.println("Pet makes a sound");
    }
}

