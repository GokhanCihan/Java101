import java.util.Comparator;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int yearPublished;
    private int pages;

    public Book(String title, String author, int yearPublished, int pages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.getTitle() + ", "
                + this.getAuthor() + ", "
                + this.getYearPublished() + ", "
                + this.getPages();
    }
}

class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());

    }
}

class PagesComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPages() - o1.getPages();
    }
}
