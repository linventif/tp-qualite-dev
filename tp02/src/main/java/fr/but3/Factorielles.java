package fr.but3;

import java.util.stream.Stream;

public class Factorielles {
    public static void main(String[] args) {
        int n = 10;

        Stream.iterate(new long[]{1, 1}, f -> new long[]{f[0] + 1, f[1] * (f[0] + 1)})
                .map(f -> f[1])
                .limit(n)
                .forEach(System.out::println);
    }
}