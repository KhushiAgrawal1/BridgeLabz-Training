package GameBox_Mobile_Game_Distribution_Platform;

import java.util.ArrayList;

class User {
    private String name;
    private ArrayList<Game> ownedGames = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.title + " added to " + name + "'s library");
    }

    public void showGames() {
        System.out.println("\nOwned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title);
        }
    }
}

