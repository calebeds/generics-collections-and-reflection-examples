package me.calebeoliveira.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet maintains the insertion order
        // doubly linked list connecting the items
        // it needs more memory than hashsets
        Set<String> set = new LinkedHashSet<>();

        set.add("Adam");
        set.add("Kevin");
        set.add("Daniel");
        set.add("Joe");
        set.add("Ana");

        for (String s: set) {
            System.out.println(s);
        }
    }
}
