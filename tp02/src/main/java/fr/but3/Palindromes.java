package fr.but3;

import java.util.stream.IntStream;

public class Palindromes {
    public static void main(String[] args) {
        int n = 10;

        IntStream.iterate(1, i -> i + 1)
                .map(i -> i * i)
                .filter(Palindromes::isPalindrome)
                .limit(n)
                .forEach(System.out::println);
    }
    
    private static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}
