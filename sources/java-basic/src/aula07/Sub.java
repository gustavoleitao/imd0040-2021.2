package aula07;

public class Sub extends Super {

    final static double PI_AO_QUADRADO = Math.PI * Math.PI;

    private int euQueroIrDormir;

    public Sub(int result){
        super(result);
        System.out.println("chamando construtor de sub...");
    }

    void print(){
        System.out.println();
    }

}
