import java.util.*;

public class Library implements Iterable<Book> {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}

class BookComparator {
    public static Comparator<Book> byAuthor() {
        return Comparator.comparing(Book::getAuthor);
    }

    public static Comparator<Book> byPublishedYear() {
        return Comparator.comparingInt(Book::getPublishedYear);
    }
}