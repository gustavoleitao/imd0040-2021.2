package aula13;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

    public static void main(String[] args) {
        List<String> listOfFoods =new LinkedList<>();

        listOfFoods.add("Banana");
        listOfFoods.add("Coffe");
        listOfFoods.add("Apple");

        for (int i = 0; i < listOfFoods.size(); i++) {
            System.out.println(listOfFoods.get(i));
        }

        Iterator<String> iterator = listOfFoods.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        listOfFoods.forEach(item -> System.out.println(item));

        listOfFoods.remove(0);
        listOfFoods.remove("Apple");

    }

}
