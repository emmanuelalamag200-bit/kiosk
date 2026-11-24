public class Drink extends Product {
    private String size;
    private String temperature;

    public Drink(String name, double basePrice, String size, String temperature) {
        super(name, basePrice);
        this.size = size;
        this.temperature = temperature;
    }

    @Override
    public double calculatePrice() {
        double upcharge = "Large".equalsIgnoreCase(size) ? 20.00 : 0.00;
        return getBasePrice() + upcharge;
    }

    @Override
    public String getDetails() {
        return size + ", " + temperature;
    }
}
