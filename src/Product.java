public class Product {
    private String p_name;
    private double p_price;
    private int p_quantity;

    public Product(String p_name, double p_price, int p_quantity) {
        this.p_name = p_name;
        this.p_price = p_price;
        this.p_quantity = p_quantity;

        if (p_quantity < 5) {
            System.out.println("Low quantity for product " + p_name);
        }
    }

    public String getP_name() {
        return p_name;
    }

    public double getP_price() {
        return p_price;
    }

    public int getP_quantity() {
        return p_quantity;
    }

    public void setP_price(double p_price) {
        this.p_price = p_price;
    }

    public void displayDetails() {
        System.out.println("Name: " + p_name);
        System.out.println("Price: " + p_price);
        System.out.println("Quantity: " + p_quantity);
    }

    public void applyDiscount() {
        // default: no discount
    }
}
