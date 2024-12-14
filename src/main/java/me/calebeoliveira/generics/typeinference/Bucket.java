package me.calebeoliveira.generics.typeinference;

public class Bucket<T> {
    private T item;

    public T getItem() {
        return this.item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {

    }
}
