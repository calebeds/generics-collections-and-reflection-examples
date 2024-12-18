package me.calebeoliveira.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapVsTreeMap {


    public static void main(String[] args) {
        // O(logN)
        Map<Integer, Integer> map = new TreeMap<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            map.put(i, i);
        }

        for (int i = 0; i < 500_000; i++) {
            map.get(i);
        }

        System.out.println("Time taken with TreeMap: " + (System.currentTimeMillis() - now));

        // O(1)
        Map<Integer, Integer> map2 = new HashMap<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500_000; i++) {
            map2.put(i, i);
        }

        for (int i = 0; i < 500_000; i++) {
            map2.get(i);
        }

        System.out.println("Time taken with HashMap: " + (System.currentTimeMillis() - now));
    }
}
