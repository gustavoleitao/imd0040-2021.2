package aula15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) {

        Map<String, Integer> mapPontos = new TreeMap();

        mapPontos.put("Pedro", 80);
        mapPontos.put("Francisco", 30);
        mapPontos.put("Maria", 124);
        mapPontos.put("Adrião", 123);

        for (Map.Entry<String, Integer> entry : mapPontos.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }

    }

}
