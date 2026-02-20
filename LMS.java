package String_temp;

import java.util.ArrayList;

public class LMS {
    //lib collection of books
    ArrayList<Book> books = new ArrayList<>();



    //
     //add books
    //Search book by title
    //Search books by author
    //search books by price range
    //display all books
    //LEND BOOK OPTIONAL
    public void addBook(Book book) {
        books.add(book);



    }
    public ArrayList<Book> getBooksbyAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> getBooksbyPriceRange(int minPrice, int maxPrice) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPrice() >= minPrice && book.getPrice() <= maxPrice) {
                result.add(book);
            }
        }
        return result;
    }
    public ArrayList<Book> getBooksbyTitle(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }
        return result;

    }
        public void displayAllBooks() {
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Price: " + book.getPrice());
                System.out.println("ISBN: " + book.getISBN());
                System.out.println();
            }
        }









}
