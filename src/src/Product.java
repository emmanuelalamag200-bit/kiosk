public abstract class Product {
    private String name;
    private double basePrice;

    public Product(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }

    public abstract double calculatePrice();
    public abstract String getDetails();

    @Override
    public String toString() {
        return String.format("%s - PHP %.2f", name, basePrice);
    }
}
