package fr.but3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Lambda {
//    public static int calcul(String[] args, java.util.function.Predicate<String> p) {
//        int count = 0;
//        for (String s : args) {
//            if (p.test(s)) {
//                count++;
//            }
//        }
//        return count;
//    }

    public static int calcul(String[] args, java.util.function.Predicate<String> p) {
        return (int) Stream.of(args).filter(p).count();
    }

    public static void main(String[] args) {
        System.out.println("Il y a " + calcul(args, x -> x.equals("coucou")) + " fois la chaîne \"coucou\" en argument");
        System.out.println("Il y a " + calcul(args, x -> x.equals("cuicui")) + " fois la chaîne \"cuicui\" en argument");

        Stream.of("coucou", "cuicui", "bonjour").forEach(System.out::println);

        Stream.of("coucou", "", "cuicui", "bonjour")
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

        Stream.of("coucou", "cuicui", "hello", "bonjour")
                .filter(s -> s.length() == 5)
                .findFirst()
                .ifPresent(System.out::println);

        java.util.function.Function<String, String> transform = s -> {
            if (s.length() < 2) return s;
            return s.substring(0, 1).toUpperCase() + "..." + s.substring(s.length() - 1);
        };

        Stream.of("chaine", "test", "a", "exemple")
                .filter(s -> s.length() >= 2)
                .map(transform)
                .forEach(System.out::println);

        Stream.of("coucou", "cuicui", "bonjour")
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .forEach(System.out::println);

        Stream.of("coucou", "cuicui", "bonjour")
                .sorted()
                .forEach(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            // Afficher les 15 premières lignes
            lines.limit(15).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                    .ifPresent(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            long count = lines.filter(s -> s.contains("begin")).count();
            System.out.println("Nombre de lignes contenant 'begin': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}