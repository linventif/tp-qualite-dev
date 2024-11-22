package fr.but3;

import java.util.Arrays;
import java.util.List;

public class Exo3_2 {
    public static void main(String[] args) {
        List<Bloc> desBlocs = Arrays.asList(
                new Cube(10.0, 2.5),
                new Boule(3.0, 2.1),
                new Cube(42.2, 10.4)
        );

        double moyenne = desBlocs.stream()
                .mapToDouble(Bloc::volume)
                .average()
                .orElse(0);

        System.out.println("moyenne = " + moyenne);
    }
}
