import java.util.ArrayList;
import java.util.List;
class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Order Class
class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getProductName() + " ($" + product.getPrice() + ")");
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Customer Class
class Customer {
    String name;
    List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println("Total Price: $" + order.getTotalPrice());
        }
    }
}
class ECommercePlatform {
    String platformName;
    List<Customer> customers;

    public ECommercePlatform(String platformName) {
        this.platformName = platformName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void showCustomers() {
        System.out.println("Customers on " + platformName + ":");
        for (Customer customer : customers) {
            System.out.println("- " + customer.name);
        }
    }
   public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform("ShopEase");

        // Create products
        Product laptop = new Product("Laptop", 800.00);
        Product phone = new Product("Smartphone", 500.00);
        Product headphones = new Product("Headphones", 50.00);

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Add customers to the platform
        platform.addCustomer(alice);
        platform.addCustomer(bob);

        // Create and place orders
        Order order1 = new Order("ORD001");
        order1.addProduct(laptop);
        order1.addProduct(headphones);
        alice.placeOrder(order1);

        Order order2 = new Order("ORD002");
        order2.addProduct(phone);
        bob.placeOrder(order2);
        alice.showOrders();
        bob.showOrders();
        platform.showCustomers();
    }
}
