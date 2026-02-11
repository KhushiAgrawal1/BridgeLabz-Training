package binary_search_tree.ECommerce_Product_Inventory;

public class MainApp {
    public static void main(String[] args) {

        ProductBST bst = new ProductBST();

        // Insert products
        bst.root = bst.insert(bst.root, 2003, "Laptop", 55000);
        bst.root = bst.insert(bst.root, 2001, "Mouse", 500);
        bst.root = bst.insert(bst.root, 2005, "Keyboard", 1500);
        bst.root = bst.insert(bst.root, 2002, "Monitor", 12000);

        // Scenario 1: Lookup product
        System.out.println("Searching SKU 2001:");
        ProductNode p = bst.search(bst.root, 2001);
        if (p != null) {
            System.out.println("Found: " + p.productName + " - ₹" + p.price);
        } else {
            System.out.println("Product not found");
        }

        // Scenario 2: Update price
        System.out.println("\nUpdating price of SKU 2005...");
        bst.updatePrice(bst.root, 2005, 1800);

        // Scenario 3: Display sorted list
        System.out.println("\nProducts sorted by SKU:");
        bst.inOrder(bst.root);
    }
}

