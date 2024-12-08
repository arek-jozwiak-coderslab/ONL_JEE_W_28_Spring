package pl.coderslab.web;

public class CartItem {
    private Integer quantity;
    private Product product;

    // Constructor
    public CartItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    // Getters and Setters
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}