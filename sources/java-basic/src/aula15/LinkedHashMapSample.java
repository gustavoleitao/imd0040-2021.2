package aula15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {

    public static void main(String[] args) {
        Map<String, Integer> mapPontos = new LinkedHashMap(16, 0.75f, true);

        mapPontos.put("Pedro", 80);
        mapPontos.put("Francisco", 30);
        mapPontos.put("Maria", 123);
        mapPontos.put("Adrião", 123);

        mapPontos.forEach((key, value) -> {
            System.out.println(key + "/" + value);
        });

        System.out.println("----");
        System.out.println(mapPontos.get("Maria"));
        System.out.println(mapPontos.get("Pedro"));
        System.out.println("----");

        mapPontos.forEach((key, value) -> {
            System.out.println(key + "/" + value);
        });

    }

}
