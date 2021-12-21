package aula16;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSample {

    public void filter(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        intStream.filter(v -> v>3).forEach(System.out::println);
    }

    public void map(){
        Stream<String> intStream = Stream.of("Olá", "Mundo");
        intStream.map(i -> i.length()).forEach(System.out::println);
    }

    public void flatMap(){
        List<List<Integer>> listOfListofInts = Arrays
                .asList(Arrays.asList(1, 2, 3),
                        Arrays.asList(4, 5, 6),
                        Arrays.asList( 7, 8, 9));
        listOfListofInts.stream().flatMap(List::stream).forEach(System.out::println);
    }

    public void distinct(){
        Stream fruitsStream = Stream.of("Apple", "Jack Fruit", "Water Melon", "Apple");
        fruitsStream.distinct().forEach(System.out::println);
    }

    public void sort(){
        Stream vegStream = Stream.of("tomoto", "Green Chilli", "Pototo", "Beet root");
        vegStream.sorted().forEach(System.out::println);
    }

    public void peek(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        intStream.filter(x -> x > 3).peek(a -> System.out.println(a)).map(x -> x * x).forEach(System.out::println);
    }

    public void limit(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        intStream.filter(v -> v>3).limit(1).forEach(System.out::println);
    }

    public void skip(){
        Stream.of("one", "two", "three", "four", "five")
                .skip(2)
                .forEach(item -> System.out.println(item));
    }

    public void findAny(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        Optional<Integer> element = intStream.filter(x -> x > 5).findAny();
        System.out.println(element);
    }

    public void findFirst(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        Optional<Integer> element = intStream.filter(x -> x > 0).findFirst();
        System.out.println(element);
    }

    public void anyMatch(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        boolean result = intStream.filter(x -> x > 0).anyMatch(c -> c == 10);
        System.out.println(result);
    }

    public void allMatch(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        boolean result = intStream.filter(x -> x > 0).allMatch(c -> c == 10);
        System.out.println(result);
    }

    public void noneMatch(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        boolean result = intStream.filter(x -> x > 0).noneMatch(c -> c == 11);
        System.out.println(result);
    }

    public void toList(){
        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 10);
        List<Integer> result = intStream.filter(x -> x >= 5).collect(Collectors.toList());
        System.out.println(result);
    }

    public void toMap(){
        Map<String, Book> map = getBooks().stream().filter(b -> b.getYear() < 1955).collect(Collectors.toMap(Book::getIsbn, Function.identity()));
        System.out.println(map.get("0395489318"));
    }

    public void toMapCollition(){
        Map<Integer, Book> map = getBooks().stream().filter(b -> b.getYear() < 1955).
                collect(Collectors.toMap(Book::getYear, Function.identity(), (existente, novo) -> novo));
        System.out.println(map.get(1954));
    }

    public void toSet(){
        Stream<Integer> intStream = Stream.of(1, 1, 2, 3, 4, 5, 10);
        Set<Integer> set = intStream.collect(Collectors.toSet());
        System.out.println(set);
    }

    public void toTreeMapCollition(){
        Map<Integer, Book> map = getBooks().stream().filter(b -> b.getYear() < 1955).
                collect(Collectors.toMap(Book::getYear, Function.identity(), (existente, novo) -> novo, TreeMap::new));
        System.out.println(map.get(1954));
    }

    List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));
        return bookList;
    }

    public void reduce(){
        Stream<Integer> intStream = Stream.of(1, 1, 2, 3, 4, 5, 10);
        Integer result = intStream.map(x -> x * 2).reduce(0, Integer::sum);
        System.out.println(result);
    }

    public void avg(){
        OptionalDouble avg = getBooks().stream().mapToInt(Book::getYear).average();
        System.out.println(avg);
    }

    public void sum(){
        int sum = getBooks().stream().mapToInt(Book::getYear).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        StreamsSample streamsSample = new StreamsSample();
        streamsSample.avg();
    }

}
