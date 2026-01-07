package SwiftCart_Grocery_Shopping_App;

public class SwiftCartMain {
    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new PerishableProduct("Milk", 60));
        cart.addProduct(new NonPerishableProduct("Rice", 200));

        cart.applyDiscount();   // Polymorphism
        cart.generateBill();
    }
}
