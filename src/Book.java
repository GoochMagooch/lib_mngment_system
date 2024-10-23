public class Book {
    String name;
    String author;
    int isbn;
    boolean isCheckedOut;

    public Book(String name, String author, int isbn, boolean isCheckedOut) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }

    public void bookCheckOut() {
        isCheckedOut = true;
    }
}
