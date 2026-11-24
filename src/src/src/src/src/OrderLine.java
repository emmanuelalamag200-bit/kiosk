public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getLineTotal() {
        return product.calculatePrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format("%dx %s (%s) - PHP %.2f",
                quantity, product.getName(), product.getDetails(), getLineTotal());
    }
}
