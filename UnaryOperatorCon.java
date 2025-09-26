package java8;
import java.util.function.UnaryOperator;

public class UnaryOperatorCon {
    public static void main(String[] args) {
        UnaryOperator<Integer> un = (t) -> t*t;
        System.out.println(un.apply(5));
    }
}
