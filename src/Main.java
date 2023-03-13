import lesson13.Book;
import lesson13.Author;
public class Main {
    public static void main(String[] args) {





        Author author = new Author("Lev", "Tolstoy");

        Book book = new Book("Война и мир", author, 1867);

        System.out.println(book.getWritingDate());
        book.setWritingDate(1866);

        System.out.println(book.getWritingDate());

        System.out.println(book);
    }
}