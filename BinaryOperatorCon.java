package java8;
import java.util.function.BinaryOperator;

public class BinaryOperatorCon {
    public static void main(String[] args) {
        BinaryOperator<String> Bo = (n, v)-> n + v;
        System.out.println(Bo.apply("Viru", "Virndra"));
    }
}
