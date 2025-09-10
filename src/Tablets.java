public class Tablets extends Product {
    private double screen_size;

    public Tablets(String p_name, double p_price, int p_quantity, double screen_size) {
        super(p_name, p_price, p_quantity);
        this.screen_size = screen_size;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Screen size: " + screen_size);
    }

    @Override
    public void applyDiscount() {
        double discountPrice = getP_price() * 0.2;
        setP_price(getP_price() - discountPrice);
    }
}
