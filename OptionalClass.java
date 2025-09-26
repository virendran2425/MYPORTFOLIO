package java8;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        Optional <String> s = getData(2);

       Optional<String> d = s.or(()-> Optional.of("NA") );
        System.out.println(d.get());

        //String d =s.isPresent() ? s.get() : "Hello World"; //NA
        //System.out.println(d);
       // System.out.println(d.toUpperCase());

        //if(s.isPresent())
         //   System.out.println(s.get());
        //s.ifPresent(q -> System.out.println(q));
        // s.ifPresent(q -> {
         //   String s2 ="Hi i am "+q;
         //   System.out.println(s2);
        //});
    }
    private static Optional <String> getData(int id){
        //get the data from table DB
        //String name = "Viru";
        String name = null;
        return Optional.ofNullable(name);

    }
}
