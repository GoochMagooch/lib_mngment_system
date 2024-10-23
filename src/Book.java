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
        this.isCheckedOut = true;
        System.out.println("Congratulations, you have checked out " + this.name + ", by " + this.author + "!");
    }

    public static void main(String[] args) {
        Book sleepTight = new Book("Sleep Tight", "J.H Markhert", 0, false);
        Book salemLot = new Book("Salem's Lot", "Stephen King", 1, false);
        Book companyOfOne = new Book("Company of One", "Paul Jarvis", 2, false);
        Book mindset = new Book("Mindset", "Carol Dweck", 3, false);
        Book quiet = new Book("Quiet", "Susan Cain", 4, false);
    }

}
