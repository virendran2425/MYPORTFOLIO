package java8;


import java.util.Arrays;
import java.util.List;

public class MethodRefranceCon {
    public String print(String d) {
        System.out.println("===="+d);
        return d;
    }
    public static void main(String[] args) {
        MethodRefranceCon mt = new MethodRefranceCon();

        List<String> l = Arrays.asList("Virendra", "Viru", "Ram", "Neha", "Sweety", "John");
        //l.forEach(v -> System.out.println(v));
        //l.forEach(MethodRefranceCon :: print);

        l.forEach(mt :: print);

    }
}
