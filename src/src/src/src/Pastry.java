public class Pastry extends Product {
    private boolean warmed;

    public Pastry(String name, double basePrice, boolean warmed) {
        super(name, basePrice);
        this.warmed = warmed;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public String getDetails() {
        return warmed ? "Warmed" : "Room Temp";
    }
}
