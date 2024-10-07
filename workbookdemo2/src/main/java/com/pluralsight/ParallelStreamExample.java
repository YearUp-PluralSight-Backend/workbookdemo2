package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Deepa", "Rahul", "Suresh", "Yiming", "Harry", "Jack", "Bob", "Larry", "Zoe", "RandomName1", "RandomName2", "RandomName3", "RandomName4", "RandomName5");

        // Process names in parallel
        names.parallelStream().forEach(name -> System.out.println(name + " - " + Thread.currentThread().getName()));
    }
}
