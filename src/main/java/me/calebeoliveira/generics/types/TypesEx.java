package me.calebeoliveira.generics.types;

public class TypesEx {
    public static void main(String[] args) {
        Store<Integer> store = new Store<>();
        store.setItem(34);
        // we can cast object into any other object
        Integer item = store.getItem();
        System.out.println(item);
    }
}
