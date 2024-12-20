package me.calebeoliveira.collections.cache;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    // we are able to store up to 5 items in the cache
    private static final int CAPACITY = 5;
    private List<Pair> cache;

    public Cache() {
        this.cache = new ArrayList<>();
    }

    public void search(String url) {
        Pair searchedItem = null;

        // we check if the given url is already searched for
        for (Pair pair: cache) {
            if(pair.getUrl().equals(url)) {
                 searchedItem = pair;
            }
        }

        // if the given item is already present in the cache
        if(searchedItem != null) {
            // update the cache (because recently searched items are in the beginning of the array)
            cache.remove(searchedItem);
            cache.add(0, searchedItem);
        } else {
            // that the URL is not present in the cache
            // it is the first time we search for a given URL
            Pair newPair = new Pair(url, "random content for the given URL");

            // we have to deal with the CAPACTIY
            // so this is how we remove items from the cache if necessary
            if(cache.size() >= CAPACITY) {
                cache.remove(CAPACITY - 1);
            }

            cache.add(0, newPair);
        }
    }

    public void showCache() {
        for (Pair pair: cache) {
            System.out.println(pair);
        }
    }
}
