package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks = new ArrayList<>();

    public Patron(String n, String pid) {
        this.name = n;
        this.patronId = pid;
    }

    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false

    public void checkInBook(Book b) {
        Book book = b;
        book.setCheckedOut(false);
        checkedOutBooks.add(book);
    }
    public void checkOutBook(Book b) {
        checkedOutBooks.remove(b);
    }
}