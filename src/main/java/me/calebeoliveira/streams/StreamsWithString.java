package me.calebeoliveira.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamsWithString {
    public static void main(String[] args) {
        String[] names = {"Adam", "Daniel", "Martha", "Kevin", "Ben", "Joe", "Brad", "Susan"};

        Stream.of(names).filter(name -> name.startsWith("B")).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
