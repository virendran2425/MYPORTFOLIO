package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionCon {
    public static void main(String[] args) {
        Function<String, String> f =(t) -> t.toUpperCase();
        System.out.println(f.apply("Virendra"));
        List<String> l = Arrays.asList("Virendra", "Viru", "Ram", "Neha", "Dev", "John");
        List<String> converttoUpeer = l.stream().map((r) -> r.toUpperCase()).collect(Collectors.toList());
        System.out.println(converttoUpeer);
    }
}

/* Function<String, Integer> f =(t) -> t.length();
        System.out.println(f.apply("Virendra"));*/

/* Function<String, String> f =(t) -> t.toUpperCase();
        System.out.println(f.apply("Virendra")); */