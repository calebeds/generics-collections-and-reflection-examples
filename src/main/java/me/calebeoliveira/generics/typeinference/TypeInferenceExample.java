package me.calebeoliveira.generics.typeinference;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceExample {
    static <T> List<T> add(List<T> list, T item1, T item2) {
        list.add(item1);
        list.add(item2);
        return list;
    }


    public static void main(String[] args) {
        List<Integer> list1 = add(new ArrayList<>(), 20, 30);
        System.out.println(list1);
    }
}
