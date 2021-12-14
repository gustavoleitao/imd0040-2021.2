package aula14;

import java.util.*;

public class SetSample {

    public static void main(String[] args) {
        Set<Integer> conjunto = new LinkedHashSet<>();
        System.out.println(conjunto.add(1));
        System.out.println(conjunto.add(1));
        System.out.println(conjunto.add(2));
        System.out.println(conjunto.add(2));
        System.out.println(conjunto.add(3));
        System.out.println(conjunto.add(3));
        conjunto.add(null);

        conjunto.forEach(System.out::println);
    }

}
