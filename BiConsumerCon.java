package java8;
import java.util.function.BiConsumer;

public class BiConsumerCon {
    public static void main(String[] args) {
        BiConsumer<String,String> Bic = (V, N) -> System.out.println(V+"==="+N);
        Bic.accept("Virendra", "Viru");
    }
}
