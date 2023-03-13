package lesson13;

import java.util.Objects;

public class Book {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return writingDate == book.writingDate && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, writingDate);
    }

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
