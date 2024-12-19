package me.calebeoliveira.collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus", "Title1", 223));
        books.add(new Book("Z", "3", 33));
        books.add(new Book("Heidegger", "Being and Time", 891));
        books.add(new Book("Michio Kaku", "Quantum Physics", 34));

        Collections.sort(books, new BookComparator().reversed());

        System.out.println(books);
    }
}
