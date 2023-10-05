package oop2opgave;

class Book extends LoanItem {
    private String author;

    public Book(String title, String author) {
        super("Bog", title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}