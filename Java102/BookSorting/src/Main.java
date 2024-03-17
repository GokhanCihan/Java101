import java.util.Collections;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> booksByPage = new TreeSet<>(new PagesComparator());
        TreeSet<Book> booksByTitle = new TreeSet<>(new TitleComparator());

        booksByPage.add(new Book("The Star-Rover", "Jack London", 1915, 329));
        booksByPage.add(new Book("The Inheritors", "William Golding", 1955, 233));
        booksByPage.add(new Book("The Caves of Steel", "Isaac Asimov", 1953, 206));
        booksByPage.add(new Book("The Talisman", "Stephen King", 2001, 735));
        booksByPage.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", 1866, 527));

        booksByTitle.addAll(booksByPage);

        System.out.println("---------------- Title-Sorted Set -------------------");
        for (Book b: booksByTitle){
            System.out.println(b.toString());
        }

        System.out.println("---------------- Page-Sorted Set -------------------");
        for (Book b: booksByPage){
            System.out.println(b.toString());
        }
    }
}

