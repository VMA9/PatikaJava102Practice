package BookSorter;

import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book> {
    private String name;
    private int pages;
    private String author;
    private String publicationDate;

    public Book(String name, int pages, String author, String publicationDate) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
//------------------------------------------------------------------------------
class PageNumberComparator implements java.util.Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPages() - o2.getPages();
    }
}
//---------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>();
        books.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "1925"));
        books.add(new Book("Moby Dick", 210, "Herman Melville", "1851"));
        books.add(new Book("Pride and Prejudice", 150, "Jane Austen", "1813"));
        books.add(new Book("To Kill a Mockingbird", 210, "Harper Lee", "1960"));
        books.add(new Book("The Catcher in the Rye", 220, "J.D. Salinger", "1951"));

        System.out.println("Books sorted by name:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nBooks sorted by page number:");
        Set<Book> booksByPageNumber = new TreeSet<>(new PageNumberComparator());
        booksByPageNumber.addAll(books);
        for (Book book : booksByPageNumber) {
            System.out.println(book);
        }
    }
}

