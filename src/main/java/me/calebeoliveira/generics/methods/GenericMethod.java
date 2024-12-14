package me.calebeoliveira.generics.methods;

public class GenericMethod {
    public <T> T showItem(T item) {
        System.out.println("The item is: " + item.toString());
        return item;
    }

    public <T,V> void printItems(T t, V v) {
        System.out.println(t.toString());
        System.out.println(v.toString());
    }

    public <T> void showItems(T[] items) {
        for(T t: items) {
            System.out.println(t);
        }
    }
}
