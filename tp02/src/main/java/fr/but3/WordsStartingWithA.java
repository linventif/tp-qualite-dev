package fr.but3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsStartingWithA {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("apple", "banana", "avocado", "cherry", "apricot", "blueberry");

        List<String> wordsStartingWithA = strings.filter(word -> word.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println(wordsStartingWithA);
    }
}
