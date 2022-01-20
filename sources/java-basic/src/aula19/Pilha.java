package aula19;

import java.util.NoSuchElementException;

public class Pilha<T> {

    private int max, topo;
    private T[] elementos;

    public Pilha(int max) {
        topo = -1;
        this.max = max;
        this.elementos = (T[]) new Object[max];
    }

    public void push(T e) {
        if (topo < max - 1) {
            elementos[++topo] = e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public T pop() {
        if (topo >= 0) {
            return elementos[topo--];
        } else {
            throw new NoSuchElementException();
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        pilha.push(10);
        pilha.push(Integer.MAX_VALUE);

        Pilha<String> pilhaStr = new Pilha<>(10);
        pilhaStr.push("imd");
        pilhaStr.push("natal");
        pilhaStr.push("ufrn");

        System.out.println(pilhaStr.pop());

    }


}

