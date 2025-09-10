import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product laptop = new Laptops("HP", 16000, 20, "EliteBook");
        Product smartphone = new Smartphones("Samsung A54", 20000, 1, "Samsung");
        Product tablet = new Tablets("Samsung A6", 1000, 15, 10.1);

        products.add(laptop);
        products.add(smartphone);
        products.add(tablet);

        for(Product p : products) {
            p.displayDetails();
            p.applyDiscount();
            System.out.println("__________________");
        }
    }
}
