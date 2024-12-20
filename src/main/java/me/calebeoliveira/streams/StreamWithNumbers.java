package me.calebeoliveira.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamWithNumbers {
    public static void main(String[] args) {
//        int[] nums = {1, 5, 3, -2, 9, 12};

        //:: operator or method reference
//        Arrays.stream(nums).forEach(System.out::println);
//        int sum = Arrays.stream(nums).sum();

//        System.out.println(sum);

        IntStream.range(0, 5).filter(i -> i % 2 == 0).forEach(i -> System.out.println(i + " "));
    }
}
