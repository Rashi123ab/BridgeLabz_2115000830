import java.util.*;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

   
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

   
    public double calculateTax() {
        return getPrice() * 0.15; // 15% tax
    }

    
    public String getTaxDetails() {
        return "Electronics tax rate: 15%";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

   
    public double calculateTax() {
        return getPrice() * 0.05; // 5% tax
    }

   
    public String getTaxDetails() {
        return "Clothing tax rate: 5%";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class EcommercePlatform{
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double price = product.getPrice();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = price + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Price:" + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Electronics(101, "Smartphone", 500));
        productList.add(new Clothing(102, "T-shirt", 50));
        productList.add(new Groceries(103, "Bag", 30));
        calculateFinalPrice(productList);
    }
}
