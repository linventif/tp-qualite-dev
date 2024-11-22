package fr.but3;

import java.util.stream.IntStream;

public class Exo3_1 {
    public static void main(String[] args) {
        int[] carres = IntStream.range(0, 50)
                .map(i -> i * i)
                .toArray();

        for (int carre : carres) {
            System.out.println(carre);
        }
    }
}
