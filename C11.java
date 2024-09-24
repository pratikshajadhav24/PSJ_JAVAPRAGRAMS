class Book {
    String title;
    String author;
    double price;

    // Constructor with multiple parameters
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Author Name", 29.99);
        b1.display();
    }
}

