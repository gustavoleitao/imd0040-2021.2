package aula19;

public interface Cache<K,V extends Number> {

    V get(K key);

    V put(K key, V valor);

}
