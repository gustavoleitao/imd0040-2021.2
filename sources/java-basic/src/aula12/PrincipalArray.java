package aula12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PrincipalArray {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,1,2,3,5,8,13,21);

        for (int item : numbers) {
            System.out.println(item);
        }

        System.out.println("--------");

        numbers.forEach(System.out::println);

        //

        Supplier<Double> fabricaNumeros = () -> Math.random();
        System.out.println(fabricaNumeros.get());
        System.out.println(fabricaNumeros.get());

        Predicate<Integer> parImpar = (input) -> input % 2 == 0;

        System.out.println("parImpar.test(8): "+parImpar.test(8));
        System.out.println("parImpar.test(1): "+parImpar.test(1));

    }

}
