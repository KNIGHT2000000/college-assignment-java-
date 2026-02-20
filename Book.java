package String_temp;

public class Book {
    String Title;
    String Author;
    int Price;
    String ISBN;

    public Book() {

    }
    public Book(String Title, String Author, int Price, String ISBN) {
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
        this.ISBN = ISBN;
    }
    //
    public String getTitle() {
        return Title;
    }
    public String getAuthor() {

            return Author;

    }
    public int getPrice() {
        return Price;
    }
    public String getISBN() {

            return ISBN;
    }

}
