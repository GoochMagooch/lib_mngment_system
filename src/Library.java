public class Library extends Book {

    public Library (String name, String author, int isbn, boolean isCheckedOut) {
        super(name, author, isbn, isCheckedOut);
    }

    public void printLibrary() {
        System.out.println();
    }

    public void printBook(Book book) {
        System.out.println("The details of this book are: ");
        System.out.println("Title: " + this.name);
        System.out.println("Author: " + this.author);
        System.out.println("Isbn: " + this.isbn);
        if (this.isCheckedOut) {
            System.out.println("Status: This book is unavailable.");
        } else {
            System.out.println("Status: This book is available.");
        }
    }

    public static void main(String[] args) {
        Book random = new Book("Random", "Random Author", 234, false);
        Book sleepTight = new Book("Sleep Tight", "J.H Markhert", 0, false);
        Book salemLot = new Book("Salem's Lot", "Stephen King", 1, false);
        Book companyOfOne = new Book("Company of One", "Paul Jarvis", 2, false);
        Book mindset = new Book("Mindset", "Carol Dweck", 3, false);
        Book quiet = new Book("Quiet", "Susan Cain", 4, false);
    }
}
