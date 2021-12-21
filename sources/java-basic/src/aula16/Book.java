package aula16;

public class Book {

    private String name;
    private int year;
    private String isbn;

    public Book(String name, int year, String isbn) {
        this.name = name;
        this.year = year;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
