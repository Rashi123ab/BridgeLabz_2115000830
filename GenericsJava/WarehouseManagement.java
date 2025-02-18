import java.util.ArrayList;
import java.util.List;
abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }
}
class Storage<T extends WarehouseItem> {//A generic class that allows storing only items that extend WarehouseItem.
    private List<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
    public static void displayItems(List<? extends WarehouseItem> items) {//accept lists of any subclass of WarehouseItem and print their names.
        for (WarehouseItem item : items) {
            System.out.println(item.getName());
        }
    }
}
class WarehouseManagement{
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Iphone"));
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Bread"));
        groceriesStorage.addItem(new Groceries("Curd"));
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Almirah"));
        furnitureStorage.addItem(new Furniture("Table"));
        Storage.displayItems(electronicsStorage.getItems());
        Storage.displayItems(groceriesStorage.getItems());
        Storage.displayItems(furnitureStorage.getItems());
    }
}

