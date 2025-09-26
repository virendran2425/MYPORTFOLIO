package java8;

import java.util.Arrays;
import java.util.Base64;

public class EncodeDecode {
    public static void main(String[] args) {
        String s = "Hello World";

        String encoded = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encoded);

        byte[] decoded = Base64.getDecoder().decode(encoded);
        // System.out.println(Arrays.toString(decoded));

        String s1 = new String(decoded);
        System.out.println(s1);
    }
}
