package me.calebeoliveira.generics.types;

public class HashTableGenericsEx<K, V> {
    private K key;
    private V value;

    public HashTableGenericsEx(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
