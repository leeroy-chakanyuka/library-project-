
package library.project;

public class Book {
    private String bookName;
    private String ISBN; 
    private int yearPub;
    private String author;

    public Book(String bookName, String ISBN, int yearPub, String author) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.yearPub = yearPub;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPub() {
        return yearPub;
    }

    public void setYearPub(int yearPub) {
        this.yearPub = yearPub;
    }
    
    
}
