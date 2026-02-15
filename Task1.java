class LibraryBook {
    String title;
    double price;

    LibraryBook() {
        title = "Unknown";
        price = 0;
    }

    LibraryBook(String t) {
        title = t;
        price = 500;
    }

    LibraryBook(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Price: " + price);
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook("Java Basics");
        LibraryBook book3 = new LibraryBook("Advanced Java", 1200);

        book1.display();
        book2.display();
        book3.display();
    }
}
