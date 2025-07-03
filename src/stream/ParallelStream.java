package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");

        long start = System.currentTimeMillis();
        // Sequential Stream
        names.stream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));
        System.out.println("Time taken in case of Sequential Processing: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        // Parallel Stream
        names.parallelStream()
                .forEach(name -> System.out.println(Thread.currentThread().getName() + " - " + name));
        System.out.println("Time taken in case of Parallel Processing: " + (System.currentTimeMillis() - start));


    }


}
