import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    
    public abstract int getLoanDuration();
    
    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
    
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    
    @Override
    public int getLoanDuration() {
        return 5;
    }
    
    @Override
    public void reserveItem() {
        isAvailable = false;
    }
    
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    
    @Override
    public int getLoanDuration() {
        return 3;
    }
    
    @Override
    public void reserveItem() {
        isAvailable = false;
    }
    
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    
 
    public int getLoanDuration() {
        return 7;
    }
 
    public void reserveItem() {
        isAvailable = false;
    }
  
    public boolean checkAvailability() {
        return isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Library {
    private List<LibraryItem> items = new ArrayList<>();
    
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    
    public LibraryItem getItem(String details) {
        for (LibraryItem item : items) {
            if (item.getItemDetails().equals(details)) {
                return item;
            }
        }
        return null;
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Library library = new Library();
        
        Book book = new Book("001", "Java Programming", "John");
        Magazine magazine = new Magazine("001", "Tech Today", "Jane");
        DVD dvd = new DVD("001", "Inception", "Christopher Nolan");
        
        library.addItem(book);
        library.addItem(magazine);
        library.addItem(dvd);
        
        System.out.println(book.getItemDetails() + ", Loan Duration: " + book.getLoanDuration() + " days");
        System.out.println(magazine.getItemDetails() + ", Loan Duration: " + magazine.getLoanDuration() + " days");
        System.out.println(dvd.getItemDetails() + ", Loan Duration: " + dvd.getLoanDuration() + " days");
        
        book.reserveItem();
        System.out.println("availability: " + book.checkAvailability());
    }
}
