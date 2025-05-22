package Q4.LibraryManagementLab;

public class Book extends Media {
    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title, String isbn) {
        super(title, isbn);
        this.author = author;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}