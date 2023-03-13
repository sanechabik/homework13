package lesson13;

public class Book {
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", writingDate=" + writingDate +
                '}';
    }

    private final String name;
    private final Author author;
    private int writingDate;

    public Book(String name, Author author, int writingDate) {
        this.name = name;
        this.author = author;
        this.writingDate = writingDate;

    }


    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getWritingDate() {
        return writingDate;
    }

    public void setWritingDate(int writingDate) {
        this.writingDate = writingDate;
    }
}
