import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private String orderId;
    private List<OrderLine> itemsList;
    private boolean discountApplied;

    public CustomerOrder(String orderId) {
        this.orderId = orderId;
        this.itemsList = new ArrayList<>();
        this.discountApplied = false;
    }

    public void addItem(Product product, int quantity) {
        itemsList.add(new OrderLine(product, quantity));
    }

    public List<OrderLine> getItemsList() {
        return itemsList;
    }

    public void setDiscountApplied(boolean discountApplied) {
        this.discountApplied = discountApplied;
    }

    public double getSubtotal() {
        double sum = 0;
        for (OrderLine line : itemsList) {
            sum += line.getLineTotal();
        }
        return sum;
    }

    public double getTotal() {
        double sub = getSubtotal();
        return discountApplied ? sub * 0.90 : sub;
    }

    public String getCartSummary() {
        if (itemsList.isEmpty()) return "Cart is empty.";
        StringBuilder sb = new StringBuilder("Order ID: " + orderId + "\n--------------------------\n");
        for (OrderLine line : itemsList) {
            sb.append(line.toString()).append("\n");
        }
        sb.append("--------------------------\n");
        sb.append(String.format("Subtotal: PHP %.2f\n", getSubtotal()));
        if (discountApplied) {
            sb.append("Discount (10%): -PHP ").append(String.format("%.2f\n", getSubtotal() * 0.10));
        }
        sb.append(String.format("TOTAL:    PHP %.2f", getTotal()));
        return sb.toString();
    }

    public String printReceipt(String paymentMethod) {
        return "====== OFFICIAL RECEIPT ======\n"
                + getCartSummary()
                + "\nPayment:  " + paymentMethod
                + "\n==============================\nThank you for your order!";
    }
}
