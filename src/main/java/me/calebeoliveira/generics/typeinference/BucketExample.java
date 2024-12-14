package me.calebeoliveira.generics.typeinference;

import java.util.ArrayList;
import java.util.List;

public class BucketExample {
    public static <T> void addStore(T t, List<Bucket<T>> list) {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list");
    }

    public static void main(String[] args) {
        List<Bucket<String>> list = new ArrayList<>();

        BucketExample.addStore("Adam", list);
        // type witness
//        BucketExample.<String>addStore("Daniel", list);
    }
}
