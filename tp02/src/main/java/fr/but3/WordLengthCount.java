package fr.but3;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordLengthCount {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("apple", "banana", "cherry", "date", "elderberry");

        Map<Integer, Long> wordLengthCounts = strings.collect(Collectors.groupingBy(
                String::length,
                Collectors.counting()
        ));

        System.out.println(wordLengthCounts);
    }
}
