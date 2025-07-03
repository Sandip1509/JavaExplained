package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
    public static void main(String[] args) {
        //=====> Result Producing : Return a value or collection <======
        //collect() – Convert stream to List, Set, Map, etc.
        List<String> names = Stream.of("A", "B", "C")
                .collect(Collectors.toList());
        //System.out.println(names);

        //reduce() – Aggregate values
        int sum = Stream.of(1, 2, 3, 4)
                .reduce(0, Integer::sum); // Result: 10
        //System.out.println(sum);

        //count() – Count elements
        long count = Stream.of("a", "b", "c").count(); // Result: 3
        //System.out.println(count);

        //min() / max() – Find min/max using comparator
        Optional<Integer> max = Stream.of(1, 5, 3)
                .max(Comparator.naturalOrder()); // Result: Optional[5]
        //System.out.println(max.get());

        //=====> Matching <======
        //anyMatch() / allMatch() / noneMatch()
        boolean anyStartsWithA = Stream.of("apple", "banana")
                .anyMatch(s -> s.startsWith("a")); // true
        //System.out.println(anyStartsWithA);

        //=====> Finding <=====
        //findFirst() / findAny() – Get one element
        Optional<String> first = Stream.of("x", "y", "z").findFirst(); // x
        //System.out.println(first.get());

        //=====> Iteration <=====
        //forEach() / forEachOrdered() – Loop through elements
        Stream.of("A", "B", "C").forEach(System.out::println);


    }
}
