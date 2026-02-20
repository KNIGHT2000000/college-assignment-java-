package String_temp;
import java.util.Scanner;
import java.util.ArrayList;



public class Main1 {
    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10, "978-0743273565");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee", 15, "978-0061120084");
        Book b3 = new Book("1984", "George Orwell", 20, "978-0451524935");
        LMS lms = new LMS();
        lms.addBook(b1);
        lms.addBook(b2);
        lms.addBook(b3);
        do{
            System.out.println("Welcome to the Library Management System");
            System.out.println("5. Add book");

            System.out.println("1. Search book by title");
            System.out.println("2. Search book by author");
            System.out.println("3. Search book by price range");
            System.out.println("4. Display all books");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 5:
                    System.out.println("Enter book title:");
                    //buffer line disturbing the input, so we need to clear the buffer
                    sc.nextLine();

                    String title = sc.nextLine();
                    System.out.println("Enter book author:");

                    String author = sc.nextLine();
                    System.out.println("Enter book price:");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter book ISBN:");
                    String ISBN = sc.nextLine();
                    Book book = new Book(title, author, price, ISBN);
                    lms.addBook(book);
                    System.out.println("Book added successfully");
                    break;
                case 1:
                    System.out.println("Enter book title:");
                    String title1 = sc.nextLine();
                    ArrayList<Book> booksbyTitle = lms.getBooksbyTitle(title1);
                    for (Book b : booksbyTitle) {
                        System.out.println("Title: " + b.getTitle());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Price: " + b.getPrice());
                        System.out.println("ISBN: " + b.getISBN());
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Enter book author:");
                    String author1 = sc.next();
                    ArrayList<Book> booksbyAuthor = lms.getBooksbyAuthor(author1);
                    for (Book b : booksbyAuthor) {
                        System.out.println("Title: " + b.getTitle());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Price: " + b.getPrice());
                        System.out.println("ISBN: " + b.getISBN());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Enter minimum price:");
                    int minPrice = sc.nextInt();
                    System.out.println("Enter maximum price:");
                    int maxPrice = sc.nextInt();
                    ArrayList<Book> booksbyPriceRange = lms.getBooksbyPriceRange(minPrice, maxPrice);
                    for (Book b : booksbyPriceRange) {
                        System.out.println("Title: " + b.getTitle());
                        System.out.println("Author: " + b.getAuthor());
                        System.out.println("Price: " + b.getPrice());
                        System.out.println("ISBN: " + b.getISBN());
                        System.out.println();
                    }
                    break;
                case 4:
                    lms.displayAllBooks();
                    break;
                case 0:
                    System.out.println("Thank you for using the Library Management System");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }


        }
        while(true);
    }}

