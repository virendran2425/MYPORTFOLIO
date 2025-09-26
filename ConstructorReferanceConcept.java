package java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferanceConcept {
    private  String name;

    public ConstructorReferanceConcept(String name){
        this.name = name;
    }
    public ConstructorReferanceConcept(){

    }
        public String print(String d) {
            System.out.println("=====" + d);
            return d;
        }

        public static void main(String[] args) {
            ConstructorReferanceConcept cr = new ConstructorReferanceConcept();

            List<String> names = Arrays.asList("Virendra", "Viru", "Ram", "Neha", "John");
            List<ConstructorReferanceConcept> collect = names.stream().map(ConstructorReferanceConcept :: new).collect(Collectors.toList());

            collect.forEach(d -> System.out.println(d));

        }
    }

