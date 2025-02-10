abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return itemName + " - Price: " + price + " - Quantity: " + quantity;
    }
}

interface Discountable {
    double applyDiscount(double price);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount(double price) {
        return price * 0.9;
    }

    public String getDiscountDetails() {
        return "10% discount applied on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    public double applyDiscount(double price) {
        return price * 0.85;
    }

    public String getDiscountDetails() {
        return "15% discount applied on Non-Veg Items";
    }
}

class OrderProcessor {
    public void processOrder(FoodItem item) {
        double totalPrice = item.calculateTotalPrice();
        if (item instanceof Discountable) {
            totalPrice = ((Discountable) item).applyDiscount(totalPrice);
        }
        System.out.println(item.getItemDetails());
        System.out.println("Total Price after Discount: " + totalPrice);
    }
}
public class FoodDeliverySystem{
    public static void main(String[] args) {
        FoodItem veg = new VegItem("Shahi Paneer", 100, 2);
        FoodItem nonVeg = new NonVegItem("Biryani", 100, 1);
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(veg);
        processor.processOrder(nonVeg);
    }
}
