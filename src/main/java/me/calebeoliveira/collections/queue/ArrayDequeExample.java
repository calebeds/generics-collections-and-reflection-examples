package me.calebeoliveira.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Double ended queue (DEQUE)
        // huge one dimensional array - O(1)

        // FIFO
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // LIFO
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
