package java8;
import java.util.function.BiPredicate;

public class BiPredicateCON {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> Bi =(a, b)-> a>b;
        System.out.println(Bi.test(20, 4));
    }
}

/* BiPredicate<Integer, Integer> Bi =(a, b)-> a>b;
        System.out.println(Bi.test(2, 4));*/