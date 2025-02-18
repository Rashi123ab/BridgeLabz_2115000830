import java.util.ArrayList;
import java.util.List;
abstract class ProductCategory {
    private String name;
    public ProductCategory(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}
class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}
class GadgetCategory extends ProductCategory {
    public GadgetCategory() {
        super("Gadgets");
    }
}
class Product<T extends ProductCategory>{
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
class ProductCatalog {
    private List<Product<? extends ProductCategory>> products = new ArrayList<>();
    public void addProduct(Product<? extends ProductCategory> product) {
        products.add(product);
    }
    public void displayProducts() {
        for (Product<? extends ProductCategory> product : products) {
            System.out.println(product.getName() + " - " + product.getCategory().getName() + product.getPrice());
        }
    }
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
class OnlineMarket{
    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("HarryPotter", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("phone", 500.0, new GadgetCategory());
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        ProductCatalog.applyDiscount(book, 10);
        ProductCatalog.applyDiscount(shirt, 5);
        ProductCatalog.applyDiscount(phone, 15);
        catalog.displayProducts();
    }
}
