package me.calebeoliveira.generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyArraysWildcard {
    public static <T> void copy(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Adam", "Ana", "Kevin");
        List<String> list2 = new ArrayList<>();

        copy(list, list2);

        System.out.println(list2);
    }
}
