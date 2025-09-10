public class Laptops extends Product {
    private String laptop_version;

    public Laptops(String p_name, double p_price, int p_quantity, String laptop_version) {
        super(p_name, p_price, p_quantity);
        this.laptop_version = laptop_version;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Laptop version: " + laptop_version);
    }

    @Override
    public void applyDiscount() {
        double discountPrice = getP_price() * 0.3;
        setP_price(getP_price() - discountPrice);
    }
}
