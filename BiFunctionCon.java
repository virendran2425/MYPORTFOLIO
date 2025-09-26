package java8;
import java.util.function.BiFunction;

public class BiFunctionCon {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Boolean> bif = (a,m) ->a<m;
        System.out.println(bif.apply(20,40));
    }
}
