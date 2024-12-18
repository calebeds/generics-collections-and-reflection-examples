package me.calebeoliveira.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Joe");
        list.add("Katy");
        list.add("Ana");

        // we can specify reversed order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
