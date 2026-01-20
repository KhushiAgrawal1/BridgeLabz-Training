package GameBox_Mobile_Game_Distribution_Platform;

class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void playDemo() {
        System.out.println("Strategy demo: Plan moves and build strategy!");
    }
}

