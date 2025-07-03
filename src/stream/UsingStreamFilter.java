package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamFilter {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 28),
                new Person("Bob", 35),
                new Person("Charlie", 32),
                new Person("Diana", 25)
        );

        List<Person> filtered = people.stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());

        for (Person p : filtered) {
            System.out.println(p.getName() + " is " + p.getAge());
        }
    }
}
