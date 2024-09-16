
package library.project;

public class Book {
    private String bookName;
    private String ISBN; 
    private int yearPub;

    public Book(String bookName, String ISBN, int yearPub) {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.yearPub = yearPub;
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
