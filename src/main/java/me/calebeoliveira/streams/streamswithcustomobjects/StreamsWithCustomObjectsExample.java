package me.calebeoliveira.streams.streamswithcustomobjects;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsWithCustomObjectsExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Heidegger", "Being and Time", 560, Type.PHILOSOPHY));
        books.add(new Book("Franz Kafka", "The Trial", 240, Type.NOVEL));
        books.add(new Book("Agatha Christie", "Death on The Niel", 370, Type.THRILLER));
        books.add(new Book("Robert F.", "Ancient Greece", 435, Type.HISTORY));
        books.add(new Book("Robert F.", "Ancient Rome", 860, Type.HISTORY));
        books.add(new Book("Hermann Broch", "Death Of Virgil", 590, Type.NOVEL));
        books.add(new Book("Albert Camus", "The Stranger", 560, Type.NOVEL));


//        List<String> result = books.stream()
//                .sorted(Comparator.comparing(Book::getAuthor))
//                .filter(b -> b.getType() == Type.NOVEL)
//                .map(Book::getAuthor)
//                .collect(Collectors.toList());
//        result.stream().forEach(System.out::println);

        // grouping by type
        Map<Type, List<Book>> booksByType = books.stream().collect(Collectors.groupingBy(Book::getType));

        // finding 2 longest books (number of pages) (more than 500 pages)
        List<String> longestBooks = books.stream().filter(book -> book.getPages() > 500)
                .map(Book::getTitle)
                .limit(2)
                .collect(Collectors.toList());

//        booksByType.entrySet().stream().forEach(System.out::println);
        longestBooks.stream().forEach(System.out::println);
    }
}
