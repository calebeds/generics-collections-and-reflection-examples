package me.calebeoliveira.streams.externalandinternaliteration;

import me.calebeoliveira.streams.streamswithcustomobjects.Book;
import me.calebeoliveira.streams.streamswithcustomobjects.Type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ExternalAndInternalIteration {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Heidegger", "Being and Time", 560, Type.PHILOSOPHY));
        books.add(new Book("Franz Kafka", "The Trial", 240, Type.NOVEL));
        books.add(new Book("Agatha Christie", "Death on The Niel", 370, Type.THRILLER));
        books.add(new Book("Robert F.", "Ancient Greece", 435, Type.HISTORY));
        books.add(new Book("Robert F.", "Ancient Rome", 860, Type.HISTORY));
        books.add(new Book("Hermann Broch", "Death Of Virgil", 590, Type.NOVEL));
        books.add(new Book("Albert Camus", "The Stranger", 560, Type.NOVEL));

        // external iteration (collection)
        List<String> titles = new ArrayList<>();

        Iterator<Book> iterator = books.iterator();

        // inherently sequential
        // no parallelization
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }

        // stream API - internal iteration
        // parallel quite easily
        List<String> titles2 = books.stream().map(Book::getTitle).collect(Collectors.toList());

        titles2.forEach(e -> System.out.println(e));

    }
}
