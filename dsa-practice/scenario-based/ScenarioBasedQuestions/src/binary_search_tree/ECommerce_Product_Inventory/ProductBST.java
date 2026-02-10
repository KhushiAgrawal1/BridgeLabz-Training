package binary_search_tree.ECommerce_Product_Inventory;

public class ProductBST {
    ProductNode root;

    // Insert product
    public ProductNode insert(ProductNode root, int sku, String name, double price) {
        if (root == null) {
            return new ProductNode(sku, name, price);
        }

        if (sku < root.sku) {
            root.left = insert(root.left, sku, name, price);
        } else if (sku > root.sku) {
            root.right = insert(root.right, sku, name, price);
        }

        return root;
    }

    // Search product by SKU
    public ProductNode search(ProductNode root, int sku) {
        if (root == null || root.sku == sku) {
            return root;
        }

        if (sku < root.sku) {
            return search(root.left, sku);
        } else {
            return search(root.right, sku);
        }
    }

    // Update price
    public void updatePrice(ProductNode root, int sku, double newPrice) {
        ProductNode product = search(root, sku);
        if (product != null) {
            product.price = newPrice;
            System.out.println("Price updated for " + product.productName);
        } else {
            System.out.println("Product not found");
        }
    }

    // In-order traversal (sorted SKU)
    public void inOrder(ProductNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.sku + " - " + root.productName + " - ₹" + root.price);
            inOrder(root.right);
        }
    }
}

