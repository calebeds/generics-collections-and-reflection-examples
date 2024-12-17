package me.calebeoliveira.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Usually we use linked list (more memory !!!)
        LinkedList<Integer> list = new LinkedList<>();

        // addFirst and addLast O(1)
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(3);

        list.removeFirst();

        list.removeLast();


        for (Integer num: list) {
            System.out.println(num);
        }
    }
}
