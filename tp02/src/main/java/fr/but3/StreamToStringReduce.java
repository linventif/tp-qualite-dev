package fr.but3;

import java.util.stream.Stream;

public class StreamToStringReduce {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("apple", "banana", "cherry", "date", "elderberry");
        int n = 3;

        String result = strings.limit(n)
                .reduce("", (partial, element) -> partial.isEmpty() ? element : partial + "," + element);

        System.out.println(result);
    }
}
