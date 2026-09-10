package Lec08.ClassicBook;

public class Book {
    private String title;
    private String author;
    private Double price;
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println(title + " - " + author + " - " + price + " - ");
    }
}
