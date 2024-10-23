public class Book {
    String name;
    String author;
    int isbn;
    boolean isCheckedOut = false;

    public Book(String name, String author, int isbn, boolean isCheckedOut) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }

    public void bookCheckOut() {
        this.isCheckedOut = true;
        System.out.println("Congratulations, you have checked out " + this.name + ", by " + this.author + "!");
    }

    public static void main(String[] args) {

    }

}
