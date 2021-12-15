package aula15;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        Map<String,Produto> produtos = new HashMap();
        produtos.put("android", new Produto("Galaxy", 5048d));
        produtos.put("ios", new Produto("Iphone", 7653d));

        produtos.keySet().forEach(key ->{
            System.out.println(produtos.get(key));
        });

        produtos.forEach((key, value) -> {
            System.out.println("Chave : " +key + " - Valor: ");
        });

        for (Map.Entry<String, Produto> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }





    }

}
