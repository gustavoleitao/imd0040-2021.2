package aula19;

import java.util.HashMap;
import java.util.Map;

public class GenericCache<T,P extends Number> implements Cache<T,P> {

    private Map<T,P> data = new HashMap<>();

    @Override
    public P put(T key, P valor) {
        valor.doubleValue();
        return data.put(key, valor);
    }

    @Override
    public P get(T key) {
        return data.get(key);
    }

    public static void main(String[] args) {
        GenericCache<String,Double> cache = new GenericCache<>();
        cache.put("0!", 1d);
        cache.put("1!", 1d);

    }

}
