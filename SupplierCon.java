package java8;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierCon {
    public static void main(String[] args) {
        Supplier<String> s=() -> "Virendra";
        System.out.println(s.get());
    }
}

/*Supplier<Integer> s=() -> new Random().nextInt(100);
        System.out.println(s.get());*/