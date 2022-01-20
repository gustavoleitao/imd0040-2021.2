package aula19;

public class GenericsBase {

    public static <T> void imprimeVetor(Object[] input){
        for (Object i : input){
            System.out.println(i);
        }
    }

    public static <T extends Comparable> T max(T[] v){
        T max = v[0];
        for (T e: v) {
            if (e.compareTo(max) > 0) max = e;
        }
        return max;
    }

    public static void main(String[] args) {

        Double vet01[] = { 3.4, 5.6, Math.PI};
        imprimeVetor(vet01);
        Double maximo = max(vet01);
        System.out.println(maximo);

        Integer vet02[] = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        imprimeVetor(vet02);
        System.out.println(max(vet02));

    }

}
