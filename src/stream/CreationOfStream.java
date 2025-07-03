package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreationOfStream {
    public static void main(String[] args) {

        //From a Collection
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream1 = list.stream();
        //stream1.filter(s -> s.equals("A")).forEach(s -> System.out.println(s));

        //From an Array
        int[] numbers = {1, 2, 3};
        IntStream intStream2 = Arrays.stream(numbers);
        //intStream2.forEach(s -> System.out.println(s));

        //Using Stream.of()
        Stream<String> stream3 = Stream.of("One", "Two", "Three");
        //stream3.forEach(s -> System.out.println(s));
        Stream<Integer> intStream3 = Stream.of(1, 2, 3, 4);
        //intStream3.forEach(s -> System.out.println(s));

        //using Stream.Builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stringStream = streamBuilder.add("Java")
                .add("Python")
                .add("Go")
                .build();
        //stringStream.forEach(s -> System.out.println(s));


        //Using Stream.generate()
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        //randomNumbers.forEach(s -> System.out.println(s));
        Stream<String> helloStr = Stream.generate(() -> "hello").limit(5);
        //helloStr.forEach(System.out::println);

        //Using Stream.iterate()
        Stream<Integer> stream6 = Stream.iterate(0, n -> n + 2).limit(5);
        //stream6.forEach(s -> System.out.println(s));
        Stream<Integer> stream7 = Stream.iterate(1, n -> n < 100, n -> n * 2);
        //stream7.forEach(s -> System.out.println(s));

        //From Primitive Streams
        IntStream intStream7 = IntStream.range(1, 5); // 1 to 4
        //intStream7.forEach(s -> System.out.println(s));
        LongStream longStream7 = LongStream.rangeClosed(1, 5); // 1 to 5
        //longStream7.forEach(s -> System.out.println(s));
        DoubleStream doubleStream7 = DoubleStream.of(1.1, 2.2, 3.3);
        doubleStream7.forEach(s -> System.out.println(s));


    }
}
