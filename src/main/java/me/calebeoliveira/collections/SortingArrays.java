package me.calebeoliveira.collections;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        // QuickSort - to sort primitive types (int, float etc.)
        // MergeSort - to sort reference types (Integer, String ...)

        int[] nums = {1, 10, 5, 2, -5, 12, 14, 0, 1, 2};
        String[] names = {"Kevin", "Daniel", "Katy", "Ana", "Joe", "Adam"};

        Arrays.sort(nums);
        Arrays.sort(names);

        // ascending order
//        for(int n: nums) {
//            System.out.print(n + " ");
//        }

        // descending order
//        for (int i = nums.length - 1; i>=0; i--) {
//            System.out.println(nums[i] + " ");
//        }

        for(String name: names) {
            System.out.print(name + " ");
        }


    }
}
