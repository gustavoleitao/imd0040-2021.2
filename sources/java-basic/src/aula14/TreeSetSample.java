package aula14;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {

    public static void main(String[] args) {
//        Set<Integer> conjunto = new TreeSet<>();
//        conjunto.add(4);
//        conjunto.add(1);
//        conjunto.add(9);
//        conjunto.forEach(System.out::println);

        Comparator<Cidade> compare = (o1, o2) -> o1.nome.compareTo(o2.nome);


        Set<Cidade> cidades = new HashSet<>();
        cidades.add(new Cidade("Natal", 850_000));
        cidades.add(new Cidade("Natal", 850_000));
        cidades.add(new Cidade("João Pessoa", 820_000));
        cidades.add(new Cidade("Recife", 1_600_000));
        cidades.forEach(item -> System.out.println(item));

    }

}
