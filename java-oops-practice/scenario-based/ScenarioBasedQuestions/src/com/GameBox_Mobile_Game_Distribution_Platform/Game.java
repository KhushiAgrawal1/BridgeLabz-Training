package GameBox_Mobile_Game_Distribution_Platform;

class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public void download() {
        System.out.println(title + " downloaded successfully");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }

    public void applyOffer(double discountPercent) {
        price = price - (price * discountPercent / 100);   // operator usage
    }
}
