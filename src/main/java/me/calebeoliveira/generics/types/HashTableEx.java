package me.calebeoliveira.generics.types;

public class HashTableEx {
    public static void main(String[] args) {
        HashTableGenericsEx<String, Integer> hashTableGenericsEx = new HashTableGenericsEx<>("Hello", 33);

        System.out.println(hashTableGenericsEx);
    }
}
