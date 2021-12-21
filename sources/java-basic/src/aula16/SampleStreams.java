package aula16;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleStreams {

    public static Optional<Integer> fazAlgo(){
        return Optional.empty();
    }

    public static List<Integer> somentePares(List<Integer> numeros){
        return numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public static List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        return bookList;
    }

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(1, 1, 2, 3, 4, 5, 10);
        Integer result = intStream.map(x -> x * 2).reduce(0, (x, y) -> x + y);
        System.out.println(result);
    }

}
