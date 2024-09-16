
package library.project;

public class Book {
    private String bookName;
    private String ISBN; 
    private int yearPub;
    private String author;
    private String description;

    public Book(String bookName, String ISBN, int yearPub, String author, String description) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.yearPub = yearPub;
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearPub() {
        return yearPub;
    }
  
    public String getDescription() {
        return description;
    }
    
    public String details(){
        return "Written by : "+this.author+"\nIn the year : "+this.yearPub+"\nISBN : "+this.ISBN;
    }
}
