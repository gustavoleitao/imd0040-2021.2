package aula13;

import java.util.*;

public class ArrayListSample2 {

    public static void main(String[] args) {

        var listOfFoods = new LinkedList<String>();
        listOfFoods.add("Morango");
        listOfFoods.add("Feijão");

        for (int i=0;i< listOfFoods.size(); i++){
            System.out.println(listOfFoods.get(i));
        }

        Iterator<String> it = listOfFoods.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        listOfFoods.forEach(item -> System.out.println(item));

        listOfFoods.remove(0);

        for (int i=0;i<1_000_000;i++){
            listOfFoods.add(String.valueOf(Math.random()));
        }

        System.out.println("Terminou...");

    }

}
