package me.calebeoliveira.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreemapExample {
    public static void main(String[] args) {
        //O(1) < O(logN)
//        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
//
//        map.put(10, "ten");
//        map.put(3, "three");
//        map.put(5, "five");
//        map.put(1, "one");
//        map.put(8, "eight");
//
//        System.out.println("Smallest key: " + map.lastKey());
//        System.out.println("Largest key: " + map.firstKey());
//
//        for(Map.Entry<Integer, String> entry: map.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Adam", 10);
        map.put("Kevin", 43);
        map.put("Ana", 56);
        map.put("Daniel", 21);
        map.put("Katy", 10);

        System.out.println("Smallest key: " + map.firstKey());
        System.out.println("Largest key: " + map.lastKey());

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
