package me.calebeoliveira.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //FIFO - O(1)
        queue.add("Adam");
        queue.add("Kevin");
        queue.add("Ana");
        queue.add("Katy");

//        System.out.println("Removing item: " + queue.remove());
//        System.out.println("Check item: " + queue.element());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
