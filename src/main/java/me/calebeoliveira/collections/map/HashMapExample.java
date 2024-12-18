package me.calebeoliveira.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    // not a Collection though
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // insert into the map O(1) if there is no collision
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Lucy");
        map.put(null, "This is null");

        // remove items in O(1) [O(1) if there is no collision]
        map.remove(2);

        // we can retrieve items based on keys O(1)
//        System.out.println(map.get(null));

//        for (Integer key: map.keySet()) {
//            System.out.println(key);
//        }

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }


    }
}
