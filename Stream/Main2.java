// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

class Main2 {
    public static void main(String[] args) {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

        System.out.println();
        // 2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(3)// skip first 3.
                .forEach(System.out::println);

        System.out.println();
        // 3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();
        System.out.println(
                IntStream
                        .range(1, 5)
                        .min());
        System.out.println();
        System.out.println(
                IntStream
                        .range(1, 5)
                        .max());
        System.out.println();
        System.out.println(
                IntStream
                        .range(1, 5)
                        .count());
        System.out.println();
        // 4. Stream.of, sorted and findFirst.
        Stream.of("Aval", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println();
        // 5. Stream from Array, sort, filter, and print.
        String[] names = { "Al", "Ank", "Kush", "Ben", "Sari", "Hans", "Anu", "Xavi", "Sajid", "Sjd" };
        Arrays.stream(names)// same as Stream.of(names)
                .filter(s -> s.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        // 6. Average of square of an int array
        Arrays.stream(new int[] { 2, 4, 6, 8, 10 })// same as Stream.of(names)
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        System.out.println();
        // 7. Stream from List, filter, and print.
        List<String> people = Arrays.asList("Al", "Ank", "Kush", "Ben", "Sari", "Hans", "Anu", "Xavi", "Sajid", "Sjd");
        people.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);

        System.out.println();
        // 8. Reduction - summary statistic

        System.out.println(
                Arrays.stream(new int[] { 2, 4, 6, 8, 10 })
                        .summaryStatistics());
    }
}
