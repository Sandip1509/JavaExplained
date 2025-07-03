package collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> hashmap = new LinkedHashMap<>(16, 0.75f, true);
        hashmap.put(1, "23");
        hashmap.put(2, "34");
        hashmap.put(3, "25");
        hashmap.put(4, "55");
        hashmap.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("After accessing element: 2");
        hashmap.get(2);
        hashmap.forEach((k,v) -> System.out.println(k + " " + v));

        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(hashmap);
        synchronizedMap.put(5, "34");
    }
    private static void practiceMethod(boolean txn){
        txn = true;
    }
}
