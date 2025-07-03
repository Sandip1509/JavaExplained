package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutStreamFilter {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 28),
                new Person("Bob", 35),
                new Person("Charlie", 32),
                new Person("Diana", 25)
        );

        List<Person> filtered = new ArrayList<>();

        for (Person p : people) {
            if (p.getAge() > 30) {
                filtered.add(p);
            }
        }

        for (Person p : filtered) {
            System.out.println(p.getName() + " is " + p.getAge());
        }
    }
}
