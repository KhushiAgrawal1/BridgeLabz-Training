package GameBox_Mobile_Game_Distribution_Platform;

class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("Arcade demo: Fast-paced action gameplay!");
    }
}
