package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerCon {
    public static void main(String[] args) {
        Consumer<String> printmsg = s -> System.out.println(s);
        printmsg.accept("Viru");
        List<String> l = Arrays.asList("Virendra", "Viru", "Ram", "Neha", "Dev", "John");
        l.stream().forEach(r -> System.out.println(r));

    }
}
