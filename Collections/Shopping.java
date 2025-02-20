import java.util.*;
class Shopping{
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    private TreeMap<Double, String> sortedItems = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }
    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            sortedItems.put(productPrices.get(product), product);
        }
    }
    public void displayCart() {
        System.out.println("Items:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }
    }
    public void displaySortedByPrice() {
        System.out.println("Items Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedItems.entrySet()) {
            System.out.println(entry.getValue() + entry.getKey());
        }
    }
    public static void main(String[] args) {
        Shopping cart = new Shopping();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);
        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);
        cart.displayCart();
        cart.displaySortedByPrice();
    }
}
