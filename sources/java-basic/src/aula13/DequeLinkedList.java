package aula13;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedList {

    public static void main(String[] args) {

        Deque<String> listOfFoods = new LinkedList<>();
        listOfFoods.push("Morango");
        listOfFoods.push("Tomate");
        System.out.println(listOfFoods.pop());

        Deque<String> listOfNames = new LinkedList<>();
        listOfNames.addFirst("Marcelo");
        listOfNames.addFirst("Thiago");
        listOfNames.forEach(System.out::println);

        System.out.println(listOfNames.peekFirst());
        System.out.println(listOfNames.peekLast());


    }

}
