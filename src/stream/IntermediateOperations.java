package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        //1. filter() – Select elements based on a condition
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        //System.out.println(evenNumbers); // [2, 4, 6]

        //2. map() – Transform each element
        List<String> names = List.of("john", "jane", "jack");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //System.out.println(upperCaseNames); // [JOHN, JANE, JACK]

        //3. flatMap() – Flatten nested structures
        List<List<String>> nestedList = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        //System.out.println(flatList); // [A, B, C, D]

        //4. peek() – Perform an action without changing the stream (useful for debugging)
        List<String> result = List.of("apple", "banana", "cherry").stream()
                //.peek(s -> System.out.println("Original: " + s))
                .map(String::toUpperCase)
                //.peek(s -> System.out.println("Mapped: " + s))
                .collect(Collectors.toList());

        //5. distinct() – Remove duplicates
        List<String> items = List.of("apple", "banana", "apple", "orange");
        List<String> uniqueItems = items.stream()
                .distinct()
                .collect(Collectors.toList());
        //System.out.println(uniqueItems); // [apple, banana, orange]

        //6. sorted() – Sort elements
        List<String> firstnames = List.of("Charlie", "Alice", "Bob");
        List<String> sortedNames = firstnames.stream()
                .sorted()
                .collect(Collectors.toList());
        //System.out.println(sortedNames); // [Alice, Bob, Charlie]

        //Custom Comparator:
        List<Integer> numberList = List.of(5, 2, 8, 1);
        List<Integer> sortedDesc = numberList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        //System.out.println(sortedDesc); // [8, 5, 2, 1]


        //7. limit() – Take first n elements
        List<Integer> intList = List.of(10, 20, 30, 40, 50);
        List<Integer> firstThree = intList.stream()
                .limit(3)
                .collect(Collectors.toList());
        //System.out.println(firstThree); // [10, 20, 30]

        //8. skip() – Skip first n elements
        List<Integer> listOfInt = List.of(10, 20, 30, 40, 50);
        List<Integer> afterTwo = listOfInt.stream()
                .skip(2)
                .collect(Collectors.toList());
        //System.out.println(afterTwo); // [30, 40, 50]


        //Example to Demonstrate Laziness
        List<String> ListOfNames = List.of("Alice", "Bob", "Charlie");

        Stream<String> stream = ListOfNames.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                }); // No output yet!

        System.out.println("Before terminal operation");

        // Now execute terminal operation
        List<String> collectionOfString = stream.collect(Collectors.toList()); // Triggers execution



        List<String> fullNames = List.of("Alice", "Bob", "Charlie");

        List<String> fullNamesOutput = fullNames.stream()
                .filter(name -> {
                    //System.out.println("Filter 1 (startsWith A/B): " + name);
                    return name.startsWith("A") || name.startsWith("B");
                })
                //.peek(name -> System.out.println("Peek 1 (after Filter 1): " + name))
                .filter(name -> {
                    //System.out.println("Filter 2 (length > 3): " + name);
                    return name.length() > 3;
                })
                //.peek(name -> System.out.println("Peek 2 (after Filter 2): " + name))
                .map(name -> {
                    //System.out.println("Map 1 (to uppercase): " + name);
                    return name.toUpperCase();
                })
                .map(name -> {
                   // System.out.println("Map 2 (add prefix): " + name);
                    return "Name: " + name;
                })
                .sorted()
                //.peek(name -> System.out.println("Peek 3 (after sorted): " + name))
                .skip(1)
                //.peek(name -> System.out.println("Peek 4 (after skip): " + name))
                .collect(Collectors.toList());

    }
}
