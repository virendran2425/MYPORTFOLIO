package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcept {
    public static void main(String[] args) {
        // Integer []  l = {1, 2, 3, 4, 5, 22, 33,44};

        //Set l1 = l.stream().collect(Collectors.toSet());

        List <Integer> l = Arrays.asList(1,2,32,34,2,4);
        Object collected = l.stream().filter(v -> v % 2 == 0)
               // .peek(x -> System.out.println(x))
                .distinct()
                .sorted()
                .limit(2)
                .skip(1)
                .peek(c -> System.out.println(c))
                .map(s ->s*2)
                .collect(Collectors.toList());
        System.out.println(collected);

        //Long l1 = Arrays.stream(l1).count();
        //System.out.println(l1);
        //System.out.println(Arrays.toString(l));

        // Set<Integer> collect = stream.of(1,2,3,4,5,6,22,33).distinct().collect(Collectors.toSet());
        // Stream.iterate(0, n ->n+1).limit(50);
        // Stream.generate(() -> Math.random()*20).limit(10);

    }
}
