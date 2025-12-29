public class Product {

    // Instance variables (unique for each object)
    String productName;
    double price;

    // Class variable (shared by all objects)
    static int totalProducts = 0;

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count whenever a product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // Class (static) method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method
    public static void main(String[] args) {

        Product p1 = new Product("Solar Panel 550W", 25000);
        Product p2 = new Product("Inverter Battery", 18000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        Product.displayTotalProducts();
    }
}
