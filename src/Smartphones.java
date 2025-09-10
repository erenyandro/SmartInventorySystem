public class Smartphones extends Product {
    private String brand;

    public Smartphones(String p_name, double p_price, int p_quantity, String brand) {
        super(p_name, p_price, p_quantity);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Brand: " + brand);
    }

    @Override
    public void applyDiscount() {
        double discountPrice = getP_price() * 0.1;
        setP_price(getP_price() - discountPrice);
    }
}
