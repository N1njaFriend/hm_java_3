public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Ревизор", "Николай Гоголь", 1836);
        Book book2 = new Book("Капитанская дочка", "Александр Пушкин", 1836);
        Book book3 = new Book("Идиот", "Фёдор Достоевский", 1868);
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println("Список книг:\n");
        library.printBooks();

        System.out.println("Сортировка по автору:\n");
        library.getBooks().sort(BookComparator.byAuthor());
        library.printBooks();

        System.out.println("Сортировка по году публикации:\n");
        library.getBooks().sort(BookComparator.byPublishedYear());
        library.printBooks();
    }
}