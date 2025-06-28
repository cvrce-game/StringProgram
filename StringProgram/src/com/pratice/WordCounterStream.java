package com.pratice;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class WordCounterStream {
    public static void main(String[] args) {
        String text = "Hello world! This is a test. Hello again, world!";
        
        Stream<String> ops = Arrays.stream(text.split("\\W+"))
                .filter(word -> !word.isEmpty());
        Long count = Arrays.stream(text.trim().split("\\W+")).filter(t -> !t.isEmpty()).count();

        ops.forEach(System.out::println);
        System.out.println("Word count: " + count);
    }
}
