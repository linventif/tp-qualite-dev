package fr.but3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToStringCollect {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("apple", "banana", "cherry", "date", "elderberry");
        int n = 3;

        String result = strings.limit(n)
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}