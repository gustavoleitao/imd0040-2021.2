package prova;

import java.util.function.Function;

public class FilterFunction {
    public Function<Integer> evenFunction(){
        boolean filter(Integer v);
    }
    public static void main(String[] args) {
        FilterFunction filterFunction = new FilterFunction<Integer>() {
            @Override
            public boolean filter(int value) {
                if(value%2==0) return true;
                else{return false;}
            }

            int input = 10;
            boolean result = filterFunction.evenFunction().apply(input);
        System.out.println(input + " é par? " + (result?"Sim":"Não"));
        }
    }