public class BookDetails{
    public static void main(String args[]){
      Books book=new Books("Harry Potter","JK Rowling",1000);
      book.display();
   }
}
class Books{
    String title;
    String author;
    int price;
    public Books(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void display(){
        System.out.println("Book name is "+title);
        System.out.println("Book's author is "+author);
        System.out.println("Book's price is "+price);
    }
}
