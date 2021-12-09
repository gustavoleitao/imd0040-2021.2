package aula13;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

    public static void main(String[] args) {

        Queue<String> listOfFoods = new LinkedList<>();
        listOfFoods.offer("Panqueca");
        listOfFoods.offer("Apple");
        listOfFoods.remove();

        System.out.println(listOfFoods.element());
        System.out.println(listOfFoods.poll());
        System.out.println(listOfFoods.element());

    }
}
